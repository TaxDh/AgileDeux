/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsession;

import java.io.IOException;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

/**
 *
 * @author rene
 */
public class JsonFileHandler {
    
    public static String ouvrireFichier(String filePath) {
        
        String jsonText = "";
        try {
            jsonText = Utf8File.loadFileIntoString(filePath);
        }catch(IOException e) {
            System.out.println("Erreur lors de la lecture du fichier JSON. " + e.getLocalizedMessage());
            System.exit(1);
        }
        
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonText);
        return jsonText;
    }
    
}
