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
abstract class Commercial extends Employé {
    private double chiffreAffaire;
    public Commercial(String matricule,String nom,String prenom,String dateEntreeService,int age,double chiffreAffaire )
    {
        super(matricule,nom,prenom,dateEntreeService,age);
          this.chiffreAffaire=chiffreAffaire;

    }
    
    public double getchiffreAffaire()
    {
        return chiffreAffaire;
    }
}
         
   
    
