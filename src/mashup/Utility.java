/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mashup;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.tools.FileObject;

/**
 *
 * @author Ecologic
 */
public class Utility {
    
    /**
     *  Utility Function for Printing 
     * 
     * @param str
     * @return 
     */
    public static   String prn(String str){
        System.out.println(str);
           
        return str;
    
    }
    /*
    
    
    
    */
    
   public static ArrayList   ReadMashUpDictionaries(String FileName) throws IOException{
    
    ArrayList<String> ar = new ArrayList();
    boolean Flag = false;
   
    if (FileName.length()>0)
    {  
     
      CSVReader reader = new CSVReader(new FileReader(FileName));
       String [] nextLine;
     
     while ((nextLine = reader.readNext()) != null) {
        if (nextLine[0].length()>0) {
             Flag = ar.add(nextLine[0].trim());
              prn(nextLine[0].trim());
        }
        
     }
       
           }else {
    
            Flag = false ;
    }  
       
       return ar;
   
        
   
   }
    
    
}
