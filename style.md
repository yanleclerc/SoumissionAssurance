# Normes de codification utilisées #

## Fichiers sources ##

- Les fichiers sources sont tous enregistrés selon le suffixe `.java`. 
(Les fichiers `.class` ne sont pas inclus dans le dépôt.)

- Une classe seulement par fichier source.

- Les imports sont au début du fichier avant la classe.

## Classes ##

- Les noms de classe sont en PascalCase.

- Toutes les classes sont des noms (sauf le main qui est la fonction du programme).

- Chaque méthode de classe possède une entête avec sa description, ses paramètres et
son retour.

## Méthodes ##

- Les noms de méthodes sont en camelCase.

## Variables ##

- Les noms de constantes sont en SNAKE_CASE (UPPER)

- Les noms de variables sont en camelCase.

## Indentation ##

- Chaque indentation est à 4 espaces de différence.

- La longueur maximale est de 80 caractères, sauf dans la Javadoc des méthodes.

- Les changements de lignes dans une fonction respectent la longueur maximale et sont 
effectués après une virgule ou un point-virgule.

- 2 sauts de ligne entre chaque méthodes.

## Commentaires ##

- Le peu de commentaires se retrouvent au début de la classe pour 
expliquer les constantes de classes et délimiter les `Getters/Setters`.

- Les commentaires sont implémentés de la façon `End Of Line` soit : ` // `.

- Les commentaires de documentation pour la Javadoc respectent les normes et sont 
délimités de la façon suivante : `/**...*/`.

## Déclarations ##

- Chaque déclarations de variable ou instructions se retrouvent sur sa propre ligne.
Aucune autre instruction sur la même ligne.