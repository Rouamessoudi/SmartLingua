package com.esprit.users.services;

import com.esprit.users.dto.UserSyncDto;
import com.esprit.users.entities.User;
import com.esprit.users.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Crée ou met à jour un utilisateur dans notre base à partir des infos Keycloak (inscription/connexion).
     */
    @Transactional
    public User syncUser(UserSyncDto dto) {
        if (dto == null || dto.getKeycloakId() == null || dto.getUsername() == null) {
            throw new IllegalArgumentException("keycloakId et username requis");
        }
        User user = userRepository.findByKeycloakId(dto.getKeycloakId())
                .orElse(new User());
        user.setKeycloakId(dto.getKeycloakId());
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        if (user.getId() == null) {
            user.setCreatedAt(java.time.Instant.now());
        }
        return userRepository.save(user);
    }
}
