/*
 *Charreton
TDA
TP1
23/09/24
 */
package tp1_manipnombresint_charreton;

import java.util.Scanner;

/**
 *
 * @author tessc
 */
public class TP1_manipNombresInt_CHARRETON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        int nb1;
        int nb2;
        sc = new Scanner(System.in);
        System.out.println("please enter your first number");
        nb1= sc.nextInt();
        System.out.println("please enter your second number");
        nb2= sc.nextInt();
        System.out.println(nb1+" "+nb2);
        System.out.println("voici la somme: "+(nb1+nb2));
        System.out.println("voici la difference: "+(nb1-nb2));
        System.out.println("voici le produit: "+(nb1*nb2));
        System.out.println("voici le quotient: "+(nb1-(nb1%nb2))/nb2);
        System.out.println("voici le reste: "+(nb1%nb2));
        
    }
    
}
