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
        montantDouble = montantDouble * 0.25;
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 100
    public String osteopathie(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        montantDouble = montantDouble * 0.25;
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 200
    public String psychologie_individuelle(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        montantDouble = montantDouble * 0.25;
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 300 a 399
    public String soin_dentaire(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        montantDouble = montantDouble * 0.0;
        return convertirDoubleEnString(montantDouble);
    }
    
}
