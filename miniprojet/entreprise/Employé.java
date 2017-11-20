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
 abstract class Employé {
     /*ATTRIBUTS NECESSAIRES A LA CLASSE ABSTRAITE*/
     
     private String matricule;
     String nom;
     String prenom;
     private int age;
     private String dateEntreeService ;
    
     public Employé (String matricule,String nom,String prenom,String dateEntreeService,int age)
     {
      this.matricule=matricule;
      this.nom = nom; 
      this.prenom = prenom;
      this.age = age;
      this.dateEntreeService = dateEntreeService;
     }
     public abstract double CalculerSalaire();
       public String getNom()
       {
           return ("l'emplooye" + nom +""+prenom );
         
       }
      
}
