/*
 * Objet contrat A, avec les méthodes type de soins associées
 */
package projetsession;

/**
 *
 * @author kf891141
 */
public class ContratA {
    
    //numero 0
    public double massotherapie(double montant){
    return montant * 0.25;
    }
    
    //numero 100
    public double osteopathie(double montant){
        return montant * 0.25; 
    }
    
    //numero 200
    public double psychologie_individuelle(double montant){
        return montant * 0.25;
    }
    
    //numero 300 a 399
    public double soin_dentaire(double montant){
        return 0.0;
    }
    
   
}
