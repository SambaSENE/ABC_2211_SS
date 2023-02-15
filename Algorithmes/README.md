# ABC_2211_SS
## Dépot de formation ABC_2211_SS 
## Algorithmes

# EXERCICE 1.1 : CALCUL DE LA MOYENNE DE 2 NOMBRES
text
        Algorithme : Calcul de moyenne de entiers
        Variables : 
            Nb1 : entier
            Nb2 : entier
            Moyenne :  réel
        Début :
            Ecrire (“Veuillez écrire une nombre “)
            Lire <- Nb1
            Ecrire (“Veuillez écrire une nombre “)
            Lire <- Nb2
            Moyenne <- Nb1 + Nb2 / 2
            Lire <- Moyenne
        Fin

text
# EXERCICE 1.2 : CALCUL DE L’AIRE ET DU VOLUME D’UNE SPHERE

Algorithme : Calcul de l’aire et Volume d’une sphère
	
    Variables : 
        Rayon : Réel
        Aire : Réel
        Volume : Réel 
    Constant : 
        Pi : 3.14
Début :
        Ecrire (“Veuillez saisir un rayon“)
        Lire <-Rayon
        Aire <- 4 * Pi * Rayon * Rayon
        Lire <- Aire
        
        Volume <- (4/3 * Pi * Rayon * Rayon * Rayon)	/ 3
        Lire <- Volume
        Ecrire (“Aire du sphère“ Aire, “Volume du sphère“ Volume)
Fin

# EXERCICE 1.3 : CALCUL DE LA SURFACE D’UN SECTEUR CIRCULAIRE

Algorithme : calcul la surface du secteur
Variables : 
		R :  Réel
		Sc : Réel 
		A : Réel 
	
Constant : 
		P : 3.14
Début :
	Ecrire (“ Veuillez saisir un rayon“)
	Lire <- R
	Ecrire (“ Veuillez saisir l’angle“)
	Lire <- A

	Sc <- Pi * R * R * A
    Ecrire (“Surface du secteur est de“ Sc)	
	
Fin
#   EXERCICE 1.4 : CALCUL D’INTERETS

Algorithme : Calcul d’intérêts	
	
Variables : 
	 S :  Réel	 I :   Réel	
	 N :  Entier
Constant : 
Début :
	Ecrire (“Veuillez saisir un nombre d’années“)
	Lire  N

	// Intérêt simple
	S <- 1 + N * I
	
	// Intérêt composé

	S  (1+N*I)	N
Écrire (S)
Fin

#   EXERCICE 1.5 : INVERSION DE 2 VALEURS

    Algorithme : inversion de 2 valeurs
    Variables : 
    A, B, C
 Début
        Écrire (‘’Saisir Nombre’’)
        Lire <-A
        Écrire (‘’Saisir Nombre’’)
        Lire <-B

        C <-A
        B <- A
        A<-C
        Écrire (A, B)
Fin

# EXERCICE 2.1 : COMPARAISON DE NOMBRES

Algorithme : comparaison de nombre 
	Variables : 
		A :  entier
Début
	Écrire (‘’ Veuillez saisir votre Age’’)
	Lire<- A
	Si A < 18 alors 
		Écrire (‘’Vous êtes mineur’’)
	Sinon Si A > 18 alors
		Écrire (‘’ Vous êtes majeur’’)
	Sinon 
		Écrire (‘’Vous êtes a pas encore née’’)
	Fin Si
Fin 
#   EXERCICE 2.2 : TRI DE NOMBRES

Variables : 
		A : entier,
		 B : entier
		i : entier
Début : 
	Écrire (’’Veuillez saisir un nombre ‘’)
	Lire  A
	Écrire (’’Veuillez saisir un nombre ‘’)
	Lire  B
	Pour i allant A à B
		si A < b alors 
			Ecrire A & B	
		sinon 
			Ecrire B &A
		Fin si
	Fin Pour
Fin 
# EXERCICE 2.3 : TRI DE NOMBRES++
Variable : 
	A : Entier
	B :  Entier
C : entier 

Début
	Écrire ‘’Veuillez saisir nombre 1’’
	Lire  A
Écrire ‘’Veuillez saisir nombre 2’’
	Lire  B
	Écrire ‘’Veuillez saisir nombre C’’
	Lire  C

	Pour i allant A à B
		Si A < b alors 
			Écrire A, B , C	
		Sinon 
			si B < A ET B< C
				Écrire B, A, C	
			Sinon 
				Écrire C, A, B
			Fin si
		Fin si
		i++
	Fin Pour
	Fin SI
Fin
#   