/* chaque soin est considéré comme une méthode
elle différe pour chaque objet (contrat), donc on utilise une classe
abstraite.
 */
package projetsession;

/**
 *
 * @author kf891141
 */
public abstract class InterfaceContrat {
    /*méthode pour chaque type de soin défini de manière générale pour 
    chaque contrat*/
    //parametre un int pour le numero et le cout, je pense
    
    //numero 0
    public abstract double massotherapie(double montant);
    
    //numero 100
    public abstract double osteopathie(double montant);
    
    //numero 200
    public abstract double psychologie_individuelle(double montant);
    
    //numero 300 a 399
    public abstract double soin_dentaire(double montant);
}
