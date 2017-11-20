/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

/**
 *
 * @author PC
 */
public abstract class Technicien extends Employé
{
    //CONSTANTES
    private final static double MULT = 5.0;
    private int nbrUniteP;

//SON CONSTRUCTEUR 
    public Technicien(String matricule, String nom, String prenom, int age, String dateEntreeService, int nbrUniteFabrique) 
    {
        super(matricule, nom, dateEntreeService, prenom, age);
        this.nbrUniteP = nbrUniteP;
    }
 
    
    public double calculerSalaire() 
    {
        return MULT * nbrUniteP;
    }
 
    
    public String getNom()
        {
            return ("Le technicien "+nom+ "" +prenom);
        }
}