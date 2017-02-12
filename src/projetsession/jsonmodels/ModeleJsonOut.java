/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsession.jsonmodels;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * l'objet que deviendra le fichier json
 */
public class ModeleJsonOut {
    private String client;
    private String mois;
    private List<Reclamation> remboursement;//c'est le meme objet que jsonIn

    //ne sert a rien de construire l'objet avec parametre
    public ModeleJsonOut() {
    }

 
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }
    
    public List<Reclamation> getRemboursement() {
        return remboursement;
    }

    public void setRemboursement(List<Reclamation> emboursement) {
        this.remboursement = remboursement;
    }
    
    public void addRemboursement(Reclamation nouveauRemboursement) {
        remboursement.add(nouveauRemboursement);
    }
}
