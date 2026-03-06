# Créer la branche Config Server et envoyer le lien à la prof

Fais **chaque étape** dans l’ordre, dans PowerShell ou Git Bash, en étant dans le dossier du projet.

---

## Étape 1 : Aller dans le dossier du projet

```powershell
cd c:\pi
```

---

## Étape 2 : Vérifier que tu es à jour

```powershell
git status
```

Tu peux voir des fichiers modifiés ou non suivis (dont `config-server`). C’est normal.

---

## Étape 3 : Créer la branche

```powershell
git checkout -b feature/config-server
```

Tu es maintenant sur la branche **feature/config-server**.

---

## Étape 4 : Tout ajouter pour le commit

```powershell
git add .
```

---

## Étape 5 : Faire le commit

```powershell
git commit -m "TP Config Server - lien à rendre à la prof"
```

Si un message demande de configurer ton identité (user.name / user.email), dis-le-moi et je t’indiquerai quoi faire.

---

## Étape 6 : Envoyer la branche sur GitHub

```powershell
git push origin feature/config-server
```

Si on te demande un identifiant, utilise ton **compte GitHub** (login + mot de passe ou token).

---

## Étape 7 : Lien à envoyer à la prof

Ouvre ce lien dans ton navigateur pour vérifier que tout s’affiche, puis envoie-le à la prof :

**https://github.com/Rouamessoudi/Smartlinguaa/tree/feature/config-server**

---

## Récap des commandes (copier-coller)

```powershell
cd c:\pi
git status
git checkout -b feature/config-server
git add .
git commit -m "TP Config Server - lien à rendre à la prof"
git push origin feature/config-server
```

Ensuite : envoyer à la prof → **https://github.com/Rouamessoudi/Smartlinguaa/tree/feature/config-server**

---

## Revenir sur ta branche cours après

Quand tu veux retravailler sur ta partie (cours, ressources, séances) :

```powershell
git checkout feature/courses
```

Tu restes dans le même dépôt ; tu changes juste de branche.
