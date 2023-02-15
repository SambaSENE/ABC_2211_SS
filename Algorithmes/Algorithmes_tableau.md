### Algorithmes tatbleau

## Exercice 1 : Recherche de nombre dans un tableau
Variables : 
            tmp := entier 
            tab [8 ,55 ,6 ,8 ,9 41 ,99];
            result = tab
            i :=entier
            n := entier 
Debut
    // Initialisation
    result = tab

    TANTQUE i < length.result faire
        SI  result[i] > result[i+1] alors
            result = Permute(result ,  i)
        fiSI
        i = i + 1
    finTANTQUE
    Verif = 

// 
    /// je cree des fonction pour l'appeler a chaque fois dans le programme 
    Fonction Permute (tab , index)
        tmp = tab[i]
        tab[i] = tab[i+1]
        tab[i+1] = tmp
    retoure tab

    Fonction  Verif (tab , index)
        SI n != result alors
            Ecrire n , "ne fait pas parti du tableau"
        SINON
            Ecrire result , n 
        finSI

    retourne 
    
Fin
