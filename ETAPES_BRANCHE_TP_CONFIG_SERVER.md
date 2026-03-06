# Créer la branche TP Config Server et envoyer le lien à la prof

Fais **exactement** ces étapes dans l’ordre, dans le dossier du projet (PowerShell ou Git Bash).

---

## Étape 1 : Créer la branche du TP

Ouvre un terminal dans le dossier du projet (ex. `c:\pi`) et tape :

```powershell
git checkout -b feature/config-server-tp
```

Tu es maintenant sur la branche **feature/config-server-tp** (le TP Config Server est dans le projet).

---

## Étape 2 : Enregistrer et pousser le TP sur GitHub

Tape ces commandes une par une :

```powershell
git add .
git commit -m "TP Config Server - lien à rendre à la prof"
git push origin feature/config-server-tp
```

Si `git push` te demande un identifiant, utilise ton compte GitHub.

---

## Étape 3 : Revenir sur ta branche (ta partie cours)

```powershell
git checkout feature/courses
```

Tu es de nouveau sur **feature/courses** (ta partie cours, ressources, séances).

---

## Étape 4 : Lien à envoyer à la prof

Envoie ce lien pour le rendu du TP Config Server :

**https://github.com/Rouamessoudi/Smartlinguaa/tree/feature/config-server-tp**

La prof ouvrira ce lien et verra tout le TP (Config Server + microservice courses client).

---

## Étape 5 : Retirer le Config Server de ta branche feature/courses

Quand tu auras fait les étapes 1 à 3 et envoyé le lien à la prof, dis-le-moi et je retirerai le Config Server de **feature/courses** pour que cette branche ne contienne que ta partie (cours, ressources, séances). Ensuite tu feras un dernier commit et push sur **feature/courses**.

---

## Récapitulatif

| Étape | Commande / action |
|-------|-------------------|
| 1 | `git checkout -b feature/config-server-tp` |
| 2 | `git add .` puis `git commit -m "TP Config Server - lien à rendre à la prof"` puis `git push origin feature/config-server-tp` |
| 3 | `git checkout feature/courses` |
| 4 | Envoyer à la prof : **https://github.com/Rouamessoudi/Smartlinguaa/tree/feature/config-server-tp** |
| 5 | Me dire quand c’est fait → je retire le Config Server de feature/courses, tu committes et pushes |
