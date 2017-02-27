/*
 * Objet contrat A, avec les méthodes type de soins associées.
 */
package projetagile;

import projetagile.jsonmodels.ModeleJsonIn;
import projetagile.jsonmodels.ModeleJsonOut;
import projetagile.jsonmodels.Reclamation;
import projetagile.jsonmodels.Remboursement;


/**
 *
 * @author kf891141
 */
public class ContratA extends InterfaceContrat{
    

    public ContratA(ModeleJsonIn modele) {
        
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
    
    //numero 150
    public String kinesitherapie (String montant){
        double montantDouble = convertirStringEnDouble(montant);
        montantDouble = montantDouble * 0.0;
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 175
    public String medecin_generalistep (String montant){
        double montantDouble = convertirStringEnDouble(montant);
        montantDouble = montantDouble * 0.5;
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
    
    //numero 400   
    public String naturo_acup(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        montantDouble = montantDouble * 0.0;
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 500
    public String chiropratie(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        montantDouble = montantDouble * 0.25;
        return convertirDoubleEnString(montantDouble);
    }
    
    //numero 600
    public String physiotherapie(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        montantDouble = montantDouble * 0.40;
        return convertirDoubleEnString(montantDouble);
    }
    //numero 700
    public String ortho_ergo(String montant){
        double montantDouble = convertirStringEnDouble(montant);
        montantDouble = montantDouble * 0.0;
        return convertirDoubleEnString(montantDouble);
    }
}