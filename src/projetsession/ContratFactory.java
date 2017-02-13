/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsession;

import projetsession.jsonmodels.ModeleJsonIn;

/**
 *
 * @author rene
 */
public class ContratFactory {
    public static InterfaceContrat instancieContrat(ModeleJsonIn modele){
        char typeContrat = modele.getTypeContrat();
        InterfaceContrat contractHolder = null;
        switch(typeContrat){
            case 'A':
                contractHolder = new ContratA(modele);
            case 'B':
                contractHolder = new ContratB(modele);
            case 'C':
                contractHolder = new ContratC(modele);
            case 'D':
                contractHolder = new ContratD(modele);
        }
        return contractHolder;
    }
}
