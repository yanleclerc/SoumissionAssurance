Liste des exigences
=============

Travail pratique 1
------------------

TP1.1 : Les champs du fichier d'entrée doivent toujours être présents : nom,
genre, age, fumeur, tabac, cannabis, alcool.

TP1.2 : Le genre doit être une valeur numérique de ISO 5218 (0,1,2,9).

TP1.3 : Personne de moins de 18 ans, elle n'est pas éligible à l'assurance.

TP1.4 : Femme âgée de plus de 85 ans (donc 86 et plus), elle n'est pas éligible
à l'assurance.

TP1.5 : Homme âgé de plus de 80 ans (donc 81 et plus), il n'est pas éligible
à l'assurance.

TP1.6 : Si une personne fume du tabac et du cannabis (les deux), elle n'est pas
éligible à l'assurance.

TP1.7 : Les noms des fichiers d'entrée et de sortie sont reçus en paramètre au
programme.

TP1.8 : Terminer l'exécution avec un message d'erreur à la console si entrée non
conforme.

Travail pratique 2
------------------

TP2.1 : Les champs du fichier d'entrée doivent toujours être présents et avec les
nouveaux paramètres : nom, genre, date de naissance, fumeur, tabac, cannabis,
alcool, antécédants, sports.

TP2.2 : La liste d'antécédents doit être une liste d'objets contenant le diagnostic
et la date. Diagnostic doit être une chaine de caractères et date, une chaine
de caractères selon ISO 8601(AAAA-MM-JJ).

TP2.3 : La liste de sports doit être une liste de chaine de caractères.

TP2.4 : La date de naissance doit être une chaine de caractères de ISO 8601(AAAA-MM-JJ).

TP2.5 : Les deux nouvelles listes peuvent être vides si la personne n'a pas d'antécédents
médicaux et ne pratique aucun sport.

TP2.6 : Si une personne est éligible à l'assurance, le montant annuel sera indiqué
dans le fichier de sortie.

TP2.7 : Une personne sans genre (0 ou 9) est éligible à l'assurance.

TP2.8 : Une personne sans genre de plus de 85 ans(donc 86 et plus) n'est pas valide
à l'assurance.

TP2.9 : Une personne pratiquant les sports suivant n'est pas disponible à l'assurance :
Bungee, Saut en parachute et Escalade.

TP2.10 : Le montant de base de l'assurance pour un homme âgé entre 18 à 29 ans
 (inclusivement), est de 150$.

TP2.11 : Le montant de base de l'assurance pour un homme âgé entre 30 à 40 ans
 (inclusivement), est de 165$.

TP2.12 : Le montant de base de l'assurance pour un homme âgé entre 41 à 59 ans
 (inclusivement), est de 200$.

TP2.13 : Le montant de base de l'assurance pour un homme âgé entre 60 à 73 ans
 (inclusivement), est de 350$.
 
TP2.14 : Le montant de base de l'assurance pour un homme âgé entre 74 à 85 ans
 (inclusivement), est de 700$.
 
TP2.15 : Le montant de base de l'assurance pour une femme ou une personne sans genre
 âgée entre 18 à 29 ans (inclusivement), est de 100$.
 
TP2.16 : Le montant de base de l'assurance pour une femme ou une personne sans genre
 âgée entre 30 à 40 ans (inclusivement), est de 140$.

TP2.17 : Le montant de base de l'assurance pour une femme ou une personne sans genre
 âgée entre 41 à 59 ans (inclusivement), est de 155$.
 
TP2.18 : Le montant de base de l'assurance pour une femme ou une personne sans genre
 âgée entre 60 à 73 ans (inclusivement), est de 250$.
 
TP2.19 : Le montant de base de l'assurance pour une femme ou une personne sans genre
 âgée entre 74 à 85 ans (inclusivement), est de 600$.
 
TP2.20 : Si la personne est fumeuse, peut importe la substance, on ajoute 100$ à
l'assurance.

TP2.21 : Si la personne consomme de l'alcool, on ajoute 5% du montant de base à
l'assurance.

TP2.22 : Si la personne a plus de 2 antécédents, on ajoute 15% du montant de base à
l'assurance.

TP2.23 : Si la personne ne pratique aucun sport, on ajoute 25$ à l'assurance.

TP2.24 : Si la personne a déjà eu un diagnostic de cancer, on ajoute 50% du montant
de base à l'assurance.

Travail pratique 3
------------------

TP3.1 : Les champs du fichier d'entrée doivent toujours être présents et avec les
        nouveaux paramètres : nom, genre, date de naissance, assurance collective,
        fumeur, tabac, cannabis, alcool, antécédants, sports. Si le client a une 
        assurance collective : employeur, numero de contrat, date d'embauche, 
        part de l'employeur et le lieu de travail.
         
TP3.2 : Une personne n'est pas éligible si le lieu de travail est soit : 
        Havre-Saint-Pierre, Chibougamau, Carignan, Entrelacs ou Fassett.

TP3.3 : La personne n'est pas éligible si elle travaille depuis moins de 3 mois
        chez l'employeur.
       
TP3.4 : La date d'embauche doit être de format ISO 8601.

TP3.5 : Le nom de l'employeur doit contenir au moins 5 caractères et au maximum 
        50.
        
TP3.6 : La part de l'employeur doit être un entier entre 0 et 100 inclusivement.

TP3.7 : Le numéro de contrat doit débuter par une des lettres suivantes : A,R,H
        et suivu d'un nombre compris entre 1000 et 7000 inclusivement.
 
TP3.8 : Le fichier de sorti doit maintenant afficher le montant de l'employeur et
        celui de l'employé.
        
TP3.9 : La part de l'employé est calculé selon la part de l'employeur.

TP3.10 : Si le calcul de la part employeur divise un sous, c'est l'employeur qui doit
         le payer.
         

Plan de tests
=============

| No.      | Fonctionnalités      | Description          | Données                          | Résultats          |
| :------: | :------------------: | :------------------: | :------------------------------: | :----------------: |
| C1       | TP1.1                | Champ nom manquant   | Données completes, sans le nom   | Message d'erreur   |
| C2       | TP1.1                | Champ genre manquant | Données completes, sans le nom   | Message d'erreur   |
| C3       | TP1.1                | Champ age manquant   | Données completes, sans le nom   | Message d'erreur   |
| C4       | TP1.1                | Champ tabac manquant | Données completes, sans le nom   | Message d'erreur   |
| C5       | TP1.1                | Champ cannabis manquant   | Données completes, sans le nom   | Message d'erreur   |
| C6       | TP1.1                | Champ alcool manquant   | Données completes, sans le nom   | Message d'erreur   |
| C7       | TP1.2                | Genre non numérique   | Mettre le genre à "1"   | Message d'erreur   |
| C8       | TP1.2                | Genre non valide   | Mettre le genre à 3   | Message d'erreur   |
| C9       | TP1.3                | Personne mineure  | Age = 17   | Non éligible   |
| C10      | TP1.3                | Personne majeure | Age = 18, ne fume pas   | Éligible   |
| C11      | TP1.4                | Femme éligible | Age = 85, genre = 2, ne fume pas   | Éligible   |
| C12      | TP1.4                | Femme non éligible  | Age = 86, genre = 2, ne fume pas   | Non éligible   |
| C13      | TP1.5                | Homme éligible | Age = 80, genre = 1, ne fume pas   | Éligible   |
| C14      | TP1.5                | Homme  non éligible | Age = 81, genre = 1, ne fume pas   | Non éligible   |
| C15      | TP1.6                | Grand fumeur | Conforme, fume les deux subs.   | Non éligible   |
| C16      | TP1.6                | Fumeur régulier | Conforme, fume du cannabis   | Éligible   |
| C17      | TP1.6                | Fumeur régulier #2 | Conforme, fume du tabac   | Éligible   |
| C18      | TP1.7                | Sans argument | Aucun fichier d'entrée/sortie   | Message d'erreur   |
| C19      | TP1.7                | 1 argument | 1 fichier d'entrée ou sortie   | Message d'erreur   |
| C20      | TP1.7                | 3 argument | 3 fichier d'entrée ou sortie   | Message d'erreur   |
| C21      | TP1.8                | Le fichier d'entrée n'existe pas |    | Message d'erreur   |
| C22      | TP1.8                | Le fichier d'entrée ne contient pas du JSON |    | Message d'erreur   |
| C23      | TP1.8                | Le fichier d'entrée contient du JSON invalide | Retirer une virgule   | Message d'erreur   |
| C24      | TP1.8                | Pas le droit de lire le fichier d'entrée |    | Message d'erreur   |
| C25      | TP1.8                | Pas le droit d'écrire le fichier de sortie |    | Message d'erreur   |
| C26      | TP1.8                | L'entrée contient une valeur qui n'est pas du bon type | Age = "vingt"   | Message d'erreur   |
|          |                      |           |         |
| C27      | TP2.1                | Champ antécédents manquant   | Données completes, sans les antécédents   | Message d'erreur   |
| C28      | TP2.1                | Champ sports manquant   | Données completes, sans les sports   | Message d'erreur   |
| C29      | TP2.2                | Antécédents n'est pas une liste   | Ne pas mettre de "[]"   | Message d'erreur   |
| C30      | TP2.2                | Antécédents ne contient pas diagnostic  | Ne pas mettre de "diagnostic"   | Message d'erreur   |
| C31      | TP2.2                | Champ diagnostic n'est pas une chaine de caractère  | Mettre diagnostic = 1  | Message d'erreur   |
| C32      | TP2.2                | Antécédents ne contient pas de date | Ne pas mettre de "depuis"   | Message d'erreur   |
| C33      | TP2.2                | Champ depuis n'est pas une chaine de caractère  | Mettre depuis = 1  | Message d'erreur   |
| C34      | TP2.2                | Champ depuis ne respecte pas ISO 8601  | Mettre depuis = "(02\12\1996)"   | Message d'erreur   |
| C35      | TP2.3                | Sports n'est pas une liste   | Ne pas mettre de "[]"   | Message d'erreur   |
| C36      | TP2.3                | Sport n'est pas une chaine de caractères   | Mettre Sports = "\[1,2]"   | Message d'erreur   |
| C37      | TP2.4                | Date de naissance n'est pas une chaine de caractère   | Mettre date de naissance = 1   | Message d'erreur   |
| C38      | TP2.4                | Date de naissance ne respecte pas ISO 8601   | Mettre date de naissance = "(02\12\1996)"   | Message d'erreur   |
| C39      | TP2.4                | Date de naissance non valide   | Mettre une date future "(2200-01-01)   | Message d'erreur   |
| C40      | TP2.5                | Antécédents vide   | Données complètes, liste vide  | Éligible et Montant annuel  |
| C41      | TP2.5                | Sports vide   | Données complètes, liste vide  | Éligible et Montant annuel  |
| C42      | TP2.6                | Montant annuel affiché   | Données complètes et éligibles | Éligible et Montant annuel   |
| C43      | TP2.7                | Sans genre éligible   | Données complètes, genre = 0 ou 9  | Éligible et Montant annuel  |
| C44      | TP2.8                | Sans genre non éligible   | Données complètes, genre = 0 ou 9, date de naissance > 1934-XX-XX  | Non éligible  |
| C45      | TP2.9                | Sports non éligible   | Données complètes, sports ="Bungee" ou "Saut en parachute" ou "Escalade"  | Non éligible  |
| C46      | TP2.10               | Montant de base homme(18-29ans)    | Données complètes, genre = 1, sans conditions supplémentaires  | Éligible et Montant annuel = 150$  |
| C47      | TP2.11               | Montant de base homme(30-40ans)    | Données complètes, genre = 1, sans conditions supplémentaires  | Éligible et Montant annuel = 165$  |
| C48      | TP2.12               | Montant de base homme(41-59ans)    | Données complètes, genre = 1, sans conditions supplémentaires  | Éligible et Montant annuel = 200$  |
| C49      | TP2.13               | Montant de base homme(60-73ans)    | Données complètes, genre = 1, sans conditions supplémentaires  | Éligible et Montant annuel = 350$  |
| C50      | TP2.14               | Montant de base homme(74-85ans)    | Données complètes, genre = 1, sans conditions supplémentaires  | Éligible et Montant annuel = 700$  |
| C51      | TP2.15               | Montant de base femme ou sans genre(18-29ans)    | Données complètes, genre = 0,2ou 9, sans conditions supplémentaires  | Éligible et Montant annuel = 100$  |
| C52      | TP2.16               | Montant de base femme ou sans genre(30-40ans)    | Données complètes, genre = 0,2ou 9, sans conditions supplémentaires  | Éligible et Montant annuel = 140$  |
| C53      | TP2.17               | Montant de base femme ou sans genre(41-59ans)    | Données complètes, genre = 0,2ou 9, sans conditions supplémentaires  | Éligible et Montant annuel = 155$  |
| C54      | TP2.18               | Montant de base femme ou sans genre(60-73ans)    | Données complètes, genre = 0,2ou 9, sans conditions supplémentaires  | Éligible et Montant annuel = 250$  |
| C55      | TP2.19               | Montant de base femme ou sans genre(74-85ans)    | Données complètes, genre = 0,2ou 9, sans conditions supplémentaires  | Éligible et Montant annuel = 600$  |
| C56      | TP2.20               | Montant fumeur cannabis   | Données complètes, fume cannabis  | Éligible et Montant annuel = (X + 100)$  |
| C57      | TP2.20               | Montant fumeur tabac  | Données complètes, fume tabac, sans conditions supplémentaires  | Éligible et Montant annuel = (X + 100.00)$  |
| C58      | TP2.21               | Montant alcool   | Données complètes, consomme alcool, sans conditions supplémentaires  | Éligible et Montant annuel = (X * 1.05)$  |
| C59      | TP2.22               | Montant antécédents  | Données complètes, plus de 2 diagnostics , sans conditions supplémentaires  | Éligible et Montant annuel = (X * 1.15)$  |
| C60      | TP2.23               | Montant sports  | Données complètes, liste de sports vide , sans conditions supplémentaires  | Éligible et Montant annuel = (X + 25.00)$  |
| C61      | TP2.24               | Montant cancer  | Données complètes, "Cancer" comme diagnostic , sans conditions supplémentaires  | Éligible et Montant annuel = (X * 1.50)$  |
| C62      | TP2.20,21,22,23,24   | Montant additionnels   | Données complètes, toutes les conditions supplémentaires | Éligible et Montant annuel = (X * 1.70 + 100 + 25) $  |
|          |                      |           |         |
| C63      | TP3.1                | Champ assurance collective manquant   | Données completes, sans assurance collective  | Message d'erreur   |
| C64      | TP3.1                | Champ employeur manquant   | Données completes, assurance collective = true, sans employeur  | Message d'erreur   |
| C65      | TP3.1                | Champ numero contrat manquant   | Données completes, assurance collective = true, sans numero contrat  | Message d'erreur   |
| C66      | TP3.1                | Champ date embauche manquant   | Données completes, assurance collective = true, sans date embauche  | Message d'erreur   |
| C67      | TP3.1                | Champ part employeur manquant   | Données completes, assurance collective = true, sans part employeur  | Message d'erreur   |
| C68      | TP3.1                | Champ lieu travail manquant   | Données completes, assurance collective = true, sans lieu travail  | Message d'erreur   |
| C69      | TP3.2                | lieu de travail non éligible   | Données completes, assurance collective = true, lieu travail = "Havre-Saint-Pierre"   | Non éligible   |
| C70      | TP3.2                | lieu de travail non éligible   | Données completes, assurance collective = true, lieu travail = "Chibougamau"   | Non éligible   |
| C71      | TP3.2                | lieu de travail non éligible   | Données completes, assurance collective = true, lieu travail = "Carignan"   | Non éligible   |
| C72      | TP3.2                | lieu de travail non éligible   | Données completes, assurance collective = true, lieu travail = "Entrelacs"   | Non éligible   |
| C73      | TP3.2                | lieu de travail non éligible   | Données completes, assurance collective = true, lieu travail = "Fassett"   | Non éligible   |
| C74      | TP3.3                | date embauche non éligible   | Données completes, assurance collective = true, date embauche < 3 mois  | Non éligible   |
| C75      | TP3.4                | date embauche non valide  | Données completes, assurance collective = true, date embauche = "(02\12\1996)"     | Message d'erreur  |
| C76      | TP3.5                | employeur non valide  | Données completes, assurance collective = true, employeur ="Fido"    | Message d'erreur  |
| C77      | TP3.5                | employeur non valide  | Données completes, assurance collective = true, employeur > 50 caractères   | Message d'erreur  |
| C78      | TP3.6                | part employeur non valide  | Données completes, assurance collective = true, part employeur = -1  | Message d'erreur  |
| C79      | TP3.6                | part employeur non valide  | Données completes, assurance collective = true, part employeur = 101  | Message d'erreur  |
| C80      | TP3.7                | numero contrat non valide  | Données completes, assurance collective = true, numero contrat ="K2299"  | Message d'erreur  |
| C81      | TP3.7                | numero contrat  valide  | Données completes, assurance collective = true, numero contrat ="A2299"  | Éligible  |
| C82      | TP3.7                | numero contrat  valide  | Données completes, assurance collective = true, numero contrat ="R2299"  | Éligible  |
| C83      | TP3.7                | numero contrat  valide  | Données completes, assurance collective = true, numero contrat ="H2299"  | Éligible  |
| C84      | TP3.7                | numero contrat non valide  | Données completes, assurance collective = true, numero contrat ="A999"  | Message d'erreur  |
| C85      | TP3.7                | numero contrat non valide  | Données completes, assurance collective = true, numero contrat ="A7001"  | Message d'erreur  |
| C86      | TP3.8                | Part employeur/employé affichés  | Données completes, assurance collective = true  | Éligible, Montant annuel, Part employeur et Part employé   |
| C87      | TP3.9                | Part employé valide  | Données completes, assurance collective = true, part employeur = 100  | Éligible, Montant annuel = X, Part employeur = X et Part employé = 0  |
| C88      | TP3.10               | Part employeur arrondi valide  | Données completes valides (VOIR C88.JSON)  | Éligible, Montant annuel = X, Part employeur = 1/2(X+0.001) et Part employé =1/2(X)   |
|          |                      |           |         |
| Tests Supplémentaires |
| C89      | TP2.4                | Date de naissance n'existe pas |  Données completes valides, date de naissance ="1992-02-32" | Message d'erreur  |
| C90      | TP3.1                | Assurance collective n'est pas un booléen |  Données completes valides, assurance collective = 1 | Message d'erreur  | 
| C91      | TP3.1                | Employeur n'est pas une chaine de caratères |  Données completes valides, employeur = 1 | Message d'erreur  | 
| C92      | TP3.1                | Numero de contrat n'est pas une chaine de caratères |  Données completes valides, numero de contrat = 1 | Message d'erreur  | 
| C93      | TP3.1                | Date d'embauche n'est pas une chaine de caratères |  Données completes valides, date d'embauche = 1 | Message d'erreur  | 
| C94      | TP3.1                | Part employeur n'est pas une valeur numérique |  Données completes valides, part employeur = "1" | Message d'erreur  | 
| C95      | TP3.1                | Lieu de travail n'est pas une chaine de caratères |  Données completes valides, lieu travail = 1 | Message d'erreur  | 
| C96      | TP3.1                | Date d'embauche n'est pas une date existance |  Données completes valides, date d'embauche = "2019-13-01" | Message d'erreur  | 
| C97      | TP3.1                | Part employeur n'est pas une valeur numérique valide |  Données completes valides, part employeur = "50.5" | Message d'erreur  | 
> Les exigences ainsi que le plan de tests pour le travail pratique 1 ont été conçus
> par Mr.Jacques Berger vu tel quel dans le cours de INF2050, lors de la séance
> du mardi 14 juillet 2020. Anciennement disponible à l'adresse suivante :
> https://www.twitch.tv/jacquesberger/videos