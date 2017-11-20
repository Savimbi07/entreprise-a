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
public class Personnel {
     private Employé[] personnel;

    private int nbreEmploye;
    private final static int NBR_MAX_EMPLOYE = 520;
    
    public Personnel() 
    {
        personnel = new Employé[NBR_MAX_EMPLOYE];
        nbreEmploye = 0;
    }
 
    public void ajouterEmployé(Employé employe) 
    {

        nbreEmploye++;
        if (nbreEmploye <= NBR_MAX_EMPLOYE) 
        {
            personnel[nbreEmploye - 1] = employe;
        } else 
        {

            System.out.println(-1);
        }
    }
 
    public double salaireMoyen() {

        double som = 0.0;
        for (int i = 0; i < nbreEmploye; i++) {

            som += personnel[i].CalculerSalaire();
        }

        return som / nbreEmploye;
    }
 
    public void afficherSalaires() 
    {

        for (int i = 0; i < nbreEmploye; i++) 
        {
            System.out.println( personnel[i].getNom() + " gagne "+ personnel[i].CalculerSalaire() + " FCFA.");

        }
    }

    void ajouterEmploye(Manutentionnaire manutentionnaire) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
