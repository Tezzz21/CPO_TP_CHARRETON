/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_charreton;

import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author tessc
 */
public class TP3_Heroic_Fantasy_CHARRETON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee(7,5,"Excalibur");
       Epee Durandal = new Epee(4,7,"Durandal");
       Baton Charme = new Baton(5,6,"Charme");
       Baton Chene = new Baton(4,5,"Chêne");
       
       ArrayList<String> TabArmes = new ArrayList<String>();
       TabArmes.add("Excalibur");
       TabArmes.add("Durandal");
       TabArmes.add("Charme");
       TabArmes.add("Chene");
       for (int i=0; i<TabArmes.size();i++){
         System.out.println(Armes.Baton);
       
       
       
    }
    
}
