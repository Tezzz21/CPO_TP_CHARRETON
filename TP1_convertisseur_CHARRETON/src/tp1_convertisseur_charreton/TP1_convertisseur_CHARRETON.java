package tp1_convertisseur_charreton;


import java.util.Scanner;

/*
Charreton 
TDA 
03/09/24
package tp1_convertisseur_charreton;

/**
 *
 * @author tessc
 */
public class TP1_convertisseur_CHARRETON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("please enter your first number");
        double celcus= sc.nextDouble();
        System.out.println(273+celcus);
        
    }
    public static double CelciusVersKelvin (double tCelcius) {
    return tCelcius+273.15;
    }
    public static double KelvinVersCelcius (double tKelvin) {
    return tKelvin-273.15;
    }
}
