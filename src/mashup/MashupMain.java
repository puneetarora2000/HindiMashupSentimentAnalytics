/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mashup;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ecologic
 */
public class MashupMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // For Reading the Mash Up Dicts

             Utility.ReadMashUpDictionaries(Common.goodenglish);
            Utility.ReadMashUpDictionaries(Common.goodhinglish);
             Utility.ReadMashUpDictionaries(Common.badenghish);
             Utility.ReadMashUpDictionaries(Common.badhinghlish);
              
        } catch (IOException ex) {
            Logger.getLogger(MashupMain.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        
        
    }
    
}
