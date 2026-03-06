# Config Server pour toute l’équipe – Où et comment

Le TP Config Server est pour **toute la plateforme** (tous les microservices). Tu crées **une branche** dans le **même dépôt** que l’équipe, tu y mets le Config Server, tu la pousses, puis vous la fusionnez dans **main** pour que tout le monde l’ait.

---

## Où créer la branche ?

- **Dépôt :** le même que l’équipe → **Smartlinguaa** (GitHub)  
- **Dossier sur ton PC :** ton projet local, par ex. `c:\pi` (celui qui est relié à ce dépôt)  
- **Nom de la branche :** par ex. **`feature/config-server`** (tout le monde comprend que c’est le Config Server pour la plateforme)

Tu ne crées **pas** un nouveau dépôt. Tu crées **une nouvelle branche** dans le dépôt existant.

---

## Comment faire – Étapes exactes

### 1. Ouvrir le terminal dans le dossier du projet

- Ouvre PowerShell ou Git Bash.  
- Va dans le dossier du projet (ex. `c:\pi`) :
  ```powershell
  cd c:\pi
  ```

### 2. Vérifier la branche actuelle

```powershell
git branch
```

Tu dois voir une branche avec `*` (par ex. `* feature/courses`).  
Si le Config Server est déjà dans ton projet (dossier `config-server`), c’est bon pour la suite.

### 3. Créer la branche pour le Config Server (pour toute l’équipe)

Tu crées une **nouvelle branche** à partir de l’état actuel (avec le Config Server dedans) :

```powershell
git checkout -b feature/config-server
```

Tu es maintenant sur la branche **feature/config-server**.  
Cette branche existe pour l’instant **seulement sur ton PC**.

### 4. Envoyer la branche sur GitHub (pour que l’équipe la voie)

```powershell
git add .
git status
git commit -m "Config Server pour toute la plateforme - TP"
git push origin feature/config-server
```

Après le `git push`, la branche **feature/config-server** existe sur GitHub. Toute l’équipe peut la voir.

### 5. Fusionner dans `main` pour que toute l’équipe l’ait

Deux possibilités :

#### Option A – Pull Request (recommandé, travail en équipe)

1. Va sur GitHub : **https://github.com/Rouamessoudi/Smartlinguaa**
2. Tu verras souvent un bandeau du type : « feature/config-server had recent pushes ».
3. Clique sur **Compare & pull request**.
4. **Base :** choisis **main** (ou la branche principale du projet).  
   **Compare :** **feature/config-server**.
5. Titre proposé : par ex. « Ajout Config Server pour toute la plateforme ».
6. Clique sur **Create pull request**.
7. Toi ou un membre de l’équipe clique sur **Merge pull request**, puis **Confirm merge**.

Après la fusion, **main** contient le Config Server. Chaque personne de l’équipe fait :

```powershell
git checkout main
git pull origin main
```

et aura le Config Server dans le projet.

#### Option B – Merge en local (si tu gères le dépôt)

Dans le même dossier (`c:\pi`) :

```powershell
git checkout main
git pull origin main
git merge feature/config-server
git push origin main
```

Ensuite tout le monde fait `git pull origin main` pour récupérer le Config Server.

---

## Schéma simple

```
[main]  ← branche principale (tout le monde travaille à partir d’ici)
   |
   |   Tu crées une branche à partir de ton travail (ou de main) :
   |
[feature/config-server]  ← tu ajoutes le Config Server ici, tu push
   |
   |   Pull Request (ou merge) vers main
   v
[main]  ← après fusion : main contient le Config Server
         → toute l’équipe fait "git pull origin main" pour l’avoir
```

---

## Récapitulatif

| Question | Réponse |
|----------|--------|
| **Où créer la branche ?** | Dans le **même dépôt** Smartlinguaa, dossier local `c:\pi` (ou ton clone du dépôt). |
| **Comment créer ?** | `git checkout -b feature/config-server` dans ce dossier. |
| **Comment l’ajouter pour toute l’équipe ?** | `git push origin feature/config-server`, puis **Pull Request** de `feature/config-server` vers **main**, puis merge. Ensuite tout le monde fait `git pull origin main`. |
| **Lien à donner à la prof (avant merge) ?** | `https://github.com/Rouamessoudi/Smartlinguaa/tree/feature/config-server` |

Si tu veux, on peut faire les commandes une par une (en commençant par `cd c:\pi` et `git branch`) et tu me dis ce que le terminal affiche à chaque étape.
