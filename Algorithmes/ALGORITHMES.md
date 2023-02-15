### EXERCICE 1.1 : CALCUL DE LA MOYENNE DE 2 NOMBRES
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
### EXERCICE 1.2 : CALCUL DE L’AIRE ET DU VOLUME D’UNE SPHERE

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

### EXERCICE 1.3 : CALCUL DE LA SURFACE D’UN SECTEUR CIRCULAIRE

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
###   EXERCICE 1.4 : CALCUL D’INTERETS

Algorithme : Calcul d’intérêts	
	
Variables : 
	 S :  Réel	 I :   Réel	
	 N :  Entier
Constant : 
Début :
	Ecrire (“Veuillez saisir un nombre d’années“)
	Lire = N

	// Intérêt simple
	S <- 1 + N * I
	
	// Intérêt composé

	S = (1+N*I)	N
	Écrire (S)
Fin

###   EXERCICE 1.5 : INVERSION DE 2 VALEURS

    Algorithme : inversion de 2 valeurs
    Variables : 
    A, B, C
 Début
        Écrire (‘’Saisir Nombre’’)
        Lire = A
        Écrire (‘’Saisir Nombre’’)
        Lire = B

        C 	=	A
        B 	= 	A
        A	=	C
        Écrire (A, B)
Fin

### EXERCICE 2.1 : COMPARAISON DE NOMBRES

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
###   EXERCICE 2.2 : TRI DE NOMBRES

Variables : 
		A : entier,
		B : entier
		i : entier
Début : 
	Écrire (’’Veuillez saisir un nombre ‘’)
	Lire = A
	Écrire (’’Veuillez saisir un nombre ‘’)
	Lire = B
	Pour i allant A à B
		si A < b alors 
			Ecrire A & B	
		sinon 
			Ecrire B & A
		Fin si
	Fin Pour
Fin 
### EXERCICE 2.3 : TRI DE NOMBRES++
Variable : 
	A : Entier
	B :  Entier
	C : entier 

Début
	Écrire ‘’Veuillez saisir nombre 1’’
	Lire = A
	Écrire ‘’Veuillez saisir nombre 2’’
	Lire = B
	Écrire ‘’Veuillez saisir nombre C’’
	Lire = C

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
###   EXERCICE 2.4 : ANNEE BISSEXTILE

	A : Entier
	
Début 
	Écrire ‘’Veuillez saisir un année ‘’
	Lire = A

	si a % 4 != 0 alors
		Ecrire "Année non bisexetile"
	sinon
		si a % 100 == 0 alors
			ecrire "Année bisexetile"
		sinon 
			si a % 400 != 0 alors
				Ecrire "Année bisexetile"
			sinon 
				Ecrire "Année non bisexetile"
	fin Si

## ANNEE BISSEXTILE 2

	Annee := Entier


	debut :
		Ecrire "Introduisez l'année"
		Lire : Annee

		si (Annee % 4 != 0) & (Annee % 100 == 0 )&(Annee % 400 !=0) alors 
			Ecrire "Lannee est bissextile"
		sinon 
			ecrire "Lannee n'est pas bissextile"
		FinSi
	fin


###   EXERCICE 2.5 : RECHERCHE DES DIVISEURS D’UN NOMBRE
Algorithmes :  recherche des diviseurs d’un nombre
	
	N : entier
	i : entier
	
	Début
		
		Ecrire "Saisissez un nombre"
		Lire <-- N
		
			Pour i allant 1 à N
				Si N % i == 0  alors
					Écrire i
				sinon
					Ecrire "le nombre n'est divisible"
				Fin Si
			Fin Pour
			ecrire n
		

###   EXERCICE 2.6 : NOMBRE PREMIER
Algorithme : Nombre Premier
	N : entier
	i : entier
	cpt : entier
	Début : 
		N = 0
		
	
		pour i de 1 à cpt
			si cpt % i == 0
				n++
		fin pour 
		si (n mod == 2 )
			Ecrire n , " est un nombre premiere"
		sinon
			n , "n'est pas un nombre premier"
		fin Si
		
	Fin

##  EXERCICE 2.7 : CONVERSION KILOMETRES → MILES
		
	Algorithme : conversion km en miles

	Variables : 
				km := double
				miles := double
				exit_prog = faux := boolean
				sting_exit = "q" := String

			Debut
				TantQue !string_exit
					Ecrire "Veuillez saisir la valeur en kilometer"
					lire km

					Si 	km < 0.01 ou km >1000000 et km == string_exit alors
						Ecrire "la valeur saisie doit etre comprise entre 0.01 à 1 000 000"
					fin Si
				Fin TantQue
			Fin
## EXERCICE 3.1 : JEU DE LA FOURCHETTE

	Algorithmes :   JEU DE LA FOURCHETTE

		// Declaration

		entier valeur
		entier score
		entier n



		Debut 
			// Initialisation
				n = Random(0 , 100)
				score = 0
			tant que vrai alors
				// On demande la saisie d'un nombre entier
				Ecrire "veuillez saisir une valeur"
				Lire valeur 

				si valeur == n alors
					ecrire "Bravo, vous avez trouver"
				sinon si valeur < n alors
					ecrire "la valeur, trouver est plus  grand"
				sinon 
					ecrire "la valeur, trouver est plus petit"
				finSi
			fin tantque

			ecrire "fin du programme"

		Fin

		
		
## EXERCICE 3.2 : BARNABE FAIT S
	Algorithme : Comptage

	Variables : 
			magasin :=  Entier
			depense := 	Entier
			i 		:= Entier
	Debut :
		magasin <-- 0
		depense <-- 0
			lire <-- depense
		
		tant que depense = 0
			si depense = 1 alors
				depense <-- 0
			sinon 
				depense <-- depense/ 2 -1
			fin si 
			magasin <-- magasin + 1
		fin tant que 
			Ecrire magasin
	Fin :
## EXERCICE 3.3 : RECHERCHER UN NOMBRE DANS UN TABLEAU

	Algorithme : Recherche un nombre dans un tableau

		tab := Tableau
		N 	:= Entier
		i  	:= Entier
		indice := entier
		tmp := entier
		Debut :

			tab = [ 5 , 6 , 7]
			N 	= 0 
			indice = -1
			Ecrire "Veuillez saisir  une valeur"
			Lire n

			pour i de 0 à |tab|-1
				si tab[i] = n alors
					indice = i
				finSi

			finPour

			si indice = -1 alors
				Ecrire "not found"
			sinon
				Ecrire indice
			finSi 
		Fin	

		
		
## EXERCICE 3.4 : RECHERCHER UNE LETTRE DANS UNE CHAINE DE CARACTERES
	
	Algorithmes :  
		
		Variables:
			mot := Caractere	
			i	:= entier 
			lettre := Caractere 

		Debut :
			Ecrire "Veuillez saisir une valeur"
			Lire mot
			Si mot = "." alors
				Ecrire "La chaine est vide"
			
			Sinon 
					Pour i de 0 à taille.mot i+1
						Si mot[i] = "a" alors
							lettre = letter + 1
						finSi
					fin Pour

					Ecrire "le nombre d'occurence est de:" ,lettre

			finSi

		Fin :






### Conversion Fahrenheit en Celcus 


	C 	:= Entier
	f 	:= Entier

	Debut :
		C = 0;
		F = 0;

		Ecrire "Veuillez saisir une temperature en Celcus"  + fc
		Lire <-- c

		Ecrire "Veuillez saisir une temperature en Fahrenheit"
		Lire <-- F


		si C > 0 alors
			F = (30 *1.8)* 5 / 9 ;
		sinon 
			si F > C alors
				C = (1 * 9/5) +32
		fin Si
	Fin

### EXERCICE 5.1 : LES FRUITS ET LEGUMES 

	Algorithmes : fruits et legumes 

	Variables : 
			legumes := Entier  
			prix:= entier
			saisir:=charactere
			indices:= entier

Debut :
	legumes = ["ognons", "carottes" , "tomate" ,"poivron","poireaux" ]

	Pour indices de 0 à |legumes| indices++

	indices := indices +1;
	finPour 

Fin :
# LES FONCTIONS

