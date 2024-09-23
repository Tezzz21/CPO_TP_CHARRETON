/*TP0
Charreton
TDA
23/09/24
Calculator
 */
package exo3;

import java.util.Scanner;

/**
 *
 * @author tessc
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        int operateur;
        System.out.println("Please enter the operator:\n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
        sc = new Scanner(System.in);
        operateur = sc.nextInt();
        if (operateur!=1 && operateur!=2 && operateur!=3 && operateur!=4 && operateur!=5){
        System.out.println("Erreur");
        System.exit(0);
        }
        System.out.println("please enter your first number");
        int operande1= sc.nextInt();
        System.out.println("please enter your second number");
        int operande2= sc.nextInt();
        if (operateur==1) {
            System.out.println(operande1+operande2);
        }
        if (operateur==2) {
           System.out.println(operande1-operande2); 
        } 
        if (operateur==3) {
           System.out.println(operande1*operande2);
        }
        if (operateur==4) {
           System.out.println(operande1/operande2);
        }  
        if (operateur==5) {
           System.out.println(operande1%operande2);
        } 
    }
    
}
