# TD2 - Minibuild

## Question 2

### À quoi servent JUnit, Hamcrest, Mockito et JaCoCo ?

- **JUnit** : permet d’écrire et d’exécuter des tests en Java.
- **Hamcrest** : fournit des matchers pour écrire des assertions plus lisibles et expressives.
- **Mockito** : permet de créer des doublures de test afin d’isoler un composant de ses dépendances.
- **JaCoCo** : mesure la couverture du code par les tests.

**JaCoCo n’est pas une bibliothèque de test à proprement parler** : c’est un outil de mesure de couverture.

## Question 3

### Task list initiale

- [ ] Créer et parser une coordonnée Gav
- [ ] Valider une coordonnée Gav
- [ ] Stocker et récupérer un artefact en mémoire
- [ ] Lire des lignes avec BufferedLineReader
- [ ] Parser un fichier de build
- [ ] Publier un artefact dans le registre
- [ ] Rechercher un artefact dans le registre
- [ ] Refuser la republication d'une même coordonnée
- [ ] Résoudre les dépendances transitives
- [ ] Orchestrer le parsing et la résolution avec BuildTool

## Question 5

Avec la technique Fake it, `Gav.parse` renvoie une valeur constante.

L'information `"org.acme"` apparaît à la fois dans le test et dans le code de production.

Cela montre que le comportement n'est pas encore réellement implémenté : le test est trop peu contraignant et permet de faire passer un code qui renvoie toujours la même valeur.