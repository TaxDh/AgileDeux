/* main du projet*/
package projetsession;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kf891141
 */
public class ProjetSession {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String jsonContents = JsonFileHandler.ouvrireFichier(System.getProperty("user.dir") + "\\resources\\input.json");
        System.out.println(jsonContents);

        
    }
    
}
