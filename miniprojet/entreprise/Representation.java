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
public abstract class Representation extends Commercial
{
   private static final double pourcentage = 0.2;
   private static final double bonus = 200.0;

    public Representation(String matricule, String nom, String prenom, String dateEntreeService, int age, double chiffreAffaire) {
        super(matricule, nom, prenom, dateEntreeService, age, chiffreAffaire);
    }
}
    
   