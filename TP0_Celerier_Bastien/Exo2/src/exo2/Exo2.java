/*
Nom prénom : Celerier Bastien
Groupe : ING1 APP BDML2
Programme : TP0 Exo2
Date : 02/11/2026
*/
package exo2;

import java.util.Scanner;

/**
 *
 * @author basti
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaration des variables
        int nb; // nombre d'entiers à additionner
        int result; // resultats
        int ind; // indice
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ENtrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        result=0;
        
        // Addition des nb premiers entiers
        ind=1;
        while (ind<= nb){
            result=result+ind;
            ind++;
        }
        
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + " entiers est " + result);
    }
    
}
