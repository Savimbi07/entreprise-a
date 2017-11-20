

package entreprise;

/**
 *
 * @author PC
 */
public class Salaire {
private static String dateEntreeService = new String();
    
    public static void main(String[] args) 
    { 
        Personnel Personne = new Personnel();
        Personne.ajouterEmployé(new Vendeur(   "09A095X", "SAVIMBOK", "KENZO", 25, dateEntreeService, 110000));
        Personne.ajouterEmployé(new Representation(   "19A095X", "CIDSON", "RAZ", dateEntreeService, 54, 110000) {

            @Override
            public double CalculerSalaire() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            
        });

        Personne.ajouterEmployé(new Technicien("14B3450X", "ALEMSON", "GREGOUARDO", 28, dateEntreeService, 110000) {

            @Override
            public double CalculerSalaire() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        Personne.ajouterEmploye(new Manutentionnaire(   "06B432", "DARFOUR", "KOLON ", 19, dateEntreeService, 110000) {

            @Override
            public double CalculerSalaire() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Personne.ajouterEmploye(new Manutentionnaire_A_risque(    "16A093X", "ALEXANDRE", "DE GENEVE", 39, dateEntreeService, 110000,25000) {

            @Override
            public double CalculerSalaire() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
 
        Personne.afficherSalaires();
        
        System.out.println("Le salaire moyen dans l'entreprise vaut "+ Personne.salaireMoyen() + " FCFA.");
 
    }    
}
