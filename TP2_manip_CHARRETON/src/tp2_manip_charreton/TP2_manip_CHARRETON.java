/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_charreton;

import java.util.Random;

/**
 *
 * @author tessc
 */
public class TP2_manip_CHARRETON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2;
        
      
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        System.out.println("---------------");
        
     
        System.out.println("Assiette 1 : "+assiette1);
        System.out.println("Assiette 2 : "+assiette2);
        
        assiette2 = assiette1;
        assiette1 = assiette3;
        
        System.out.println("Après l'échange des assiettes :");
        System.out.println("Assiette 1 : "+assiette1);
        System.out.println("Assiette 2 : "+assiette2);
        
        System.out.println("----------");
        
        Moussaka [] tab = new Moussaka[10];
        
        //Génération d'un nombre aléatoire de calories
        Random generateurAleat = new Random();
        
        for(int i=0;i<tab.length;i++){
            tab[i] = new Moussaka(generateurAleat.nextInt(500));
            System.out.println(tab[i]);
        }//fin boucle
        
    }
    
}
