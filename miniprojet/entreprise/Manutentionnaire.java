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
public abstract class Manutentionnaire  extends Employé
{
    private final static double TAUX_HORAIRE = 65.0;
    private int tempsPasse;

 
    public Manutentionnaire(String matricule, String nom, String prenom, int age,String dateEntreeService, int tempsPasse) 
    {
        super(matricule, nom, prenom, dateEntreeService,age);
        this.tempsPasse = tempsPasse;
    }
 
    
    public double calculerSalaire() 
    {
        return TAUX_HORAIRE * tempsPasse;
    }
 
    
    @Override
    public String getNom()
        {
            return ("Le Manutentionnaire "+nom+ " " +prenom );
        }

    

   
    
    
}
