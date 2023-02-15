##  Echange de variables 

Variables : 
    a est un eniter
    b est un entier
    c est un entier

Debut 
    Ecrire "Veuillez saisir la premiere valeur"
    Lire a
    Ecrire "Veuillez saisir la Seconde valeur"
    lire b

    Inversion( a , b)

Fin

PROCEDURE Inversion (VAL entier a , VAL entier b)
    c <-- a
    a <-- b
    b <-- a

FIN PROCEDURE

## Aire et Perimetre d'un triangle

    Variables :
            A est un entier
            b est un entier
            c est un entier

    Debut
        Ecrire "Veuillez saisir la premiere cote"
        Lire  A 
        Ecrire "Veuillez saisir la deuxieme cote"
        Lire B
        Ecrire "Veuillez saisir la troisieme cote"
        Lire C

        perimetre(A , B , C);



        Procedure perimetreDuTriangle(entier a ,  entier B ,  entier C)
            resultat est un entier
            

            resultat = A + B + C
            Ecrire "La perimetre d'un triangle est de: " , resultat

        Fin Procedure

        Procedure aireDuTriangle(entier a , entier b , entier c)
            aire est une entier

            aire = ((perimetre / 2 - a) * (perimetre / 2 - b) * (perimetre / 2 - c)) * 1/2

            Ecrire "l'aire du triange est" ,  aire


        fin Procedure

    Fin