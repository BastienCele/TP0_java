/*
Nom prénom : Celerier Bastien
Groupe : ING1 APP BDML2
Programme : TP0 Calculator
Date : 02/11/2026
*/
package calculator;

import java.util.Scanner;

/**
 *
 * @author basti
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int operateur;
        int operande1;
        int operande2;
        int result = 0;
        
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez un nombre entier : ");
        operateur=sc.nextInt();
        
        System.out.println("Donnez une première valeur : ");
        operande1=sc.nextInt();
        
        System.out.println("Donnez une première valeur : ");
        operande2=sc.nextInt();
        
        switch (operateur) {
            case 1:
                result = operande1 + operande2;
                break;
            case 2:
                result = operande1 - operande2;
                break;
            case 3:
                result = operande1 * operande2;
                break;
            case 4:
                result = operande1 / operande2;
                break;
            case 5:
                result = operande1 % operande2;
                break;
            default:
                System.out.println("L'opération n'existe pas");
                break;
        }
        
        System.out.println("Le résultat est "+ result);
    }
    
}
