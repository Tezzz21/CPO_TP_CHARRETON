/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_charreton;

/**
 *
 * @author tessc
 */
public class Epee extends Arme {
    private int finesse;
     
   //constructeur:
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque); // Initialisation des attributs hérités
        this.finesse = Math.min(finesse, 100); 
    }
    public int getFinesse() {
        return finesse;
    }
    @Override
    public String toString() {
        return "Epee{" +
                "nom='" + getNom() + '\'' +
                ", niveauAttaque=" + getNiveauAttaque() +
                ", finesse=" + finesse +
                '}';
    }
}
