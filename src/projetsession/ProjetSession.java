/* main du projet*/
package projetsession;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import projetsession.jsonmodels.ModeleJsonIn;
import projetsession.jsonmodels.ModeleJsonOut;

/**
 *
 * @author kf891141
 */
public class ProjetSession {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String inputFilePath = args[0];
        String outputFilePath = args[1];
        
        try{
            ModeleJsonIn reclamation = JsonFileHandler.ouvrireFichier(inputFilePath);
            InterfaceContrat nouveauContrat = ContratFactory.instancieContrat(reclamation);
            ModeleJsonOut test = nouveauContrat.calculRemboursement();
            JsonFileHandler.ecrireFichier(outputFilePath, test);
        } catch (InvalidArgumentException e) {
            //TODO WRITE TO ERROR FILE
            JsonFileHandler.ecrireFichierErreur(outputFilePath);
            System.exit(1);
        }
                
        

        //pour l'instant je fais tout ici...
        
        
    }
    
}
