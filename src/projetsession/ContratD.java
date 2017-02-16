/*
 * Objet contrat D, avec les méthodes type de soins associées
 */
package projetsession;

import projetsession.jsonmodels.ModeleJsonIn;
import projetsession.jsonmodels.ModeleJsonOut;
import projetsession.jsonmodels.Reclamation;
import projetsession.jsonmodels.Remboursement;

/**
 *
 * @author kf891141
 */
public class ContratD extends InterfaceContrat{
     public ContratD(ModeleJsonIn modele) {
        
        super(modele);
    }
    
    //Type de soin
    //numero 0
    public String massotherapie(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        if(montantDouble <= 85){
            montantDouble = montantDouble * 0.100;
        } else {
            montantDouble = 85;
        }
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 100
    public String osteopathie(String montant){
        double montantDouble = convertirStringEnDouble(montant);
       if(montantDouble <= 75){
            montantDouble = montantDouble * 0.100;
        } else {
            montantDouble = 75;
        }
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 200
    public String psychologie_individuelle(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        if(montantDouble <= 100){
            montantDouble = montantDouble * 0.100;
        } else {
            montantDouble = 100;
        }
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 300 a 399
    public String soin_dentaire(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        montantDouble = montantDouble * 0.100;
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 400   
    public String naturo_acup(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        if(montantDouble <= 65){
            montantDouble = montantDouble * 0.100;
        } else {
            montantDouble = 65;
        }
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 500
    public String chiropratie(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        if(montantDouble <= 65){
            montantDouble = montantDouble * 0.100;
        } else {
            montantDouble = 65;
        }
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 600
    public String physiotherapie(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        if(montantDouble <= 100){
            montantDouble = montantDouble * 0.100;
        } else {
            montantDouble = 100;
        }
        return convertirDoubleEnString(montantDouble);
    }
    //numero 700
    public String ortho_ergo(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        if(montantDouble <= 100){
            montantDouble = montantDouble * 0.100;
        } else {
            montantDouble = 90;
        }
        return convertirDoubleEnString(montantDouble);
    }
   
}
