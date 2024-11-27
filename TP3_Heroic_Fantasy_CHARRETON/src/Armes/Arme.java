package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tessc
 */
public abstract class Arme {
    private String nom;
    private int niveauAttaque,age,finesse;
    
    public Arme(String nom, int niveauAttaque) {
        this.nom=nom;
        if (niveauAttaque<=100){
            this.niveauAttaque=niveauAttaque;
        }
        else{
            this.niveauAttaque=100;
        }
    }
    public String getNom() {
        return nom;
    }
    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    public int getAge() {
        return age;
    }
    public int getFinesse() {
        return finesse;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFinesse(int finesse) {
        this.finesse = finesse;
    }
}
