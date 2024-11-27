/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;
/**
 *
 * @author tessc
 */
public class Baton extends Arme {
    int Age;
    //Constructeur
    public Baton(int age, int niveauAttaque, String nom) {
        super(nom, niveauAttaque);
        this.setAge(age);
    }  // Fin Constructeur



    
    //toString
    @Override
    public String toString() {
        return "Baton{" + "age=" + this.getAge() + ",lvl=" + this.getNiveauAttaque() +",name="+this.getNom()+'}';
    }
    
}
