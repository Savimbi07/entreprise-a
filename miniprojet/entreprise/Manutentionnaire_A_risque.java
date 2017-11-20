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

public abstract class Manutentionnaire_A_risque extends Manutentionnaire implements Employe_Arisque 
{
    public Manutentionnaire_A_risque(String matricule, String nom, String prenom, int age, String dateEntreeService, int tempsPasse,int PRIME) 
    {
        super(matricule, nom, prenom, tempsPasse, dateEntreeService, age);

    }
 
    @Override
    public double calculerSalaire() 
    {
        double PRIME = 25000;
        return super.calculerSalaire() + PRIME;
    }

}
 