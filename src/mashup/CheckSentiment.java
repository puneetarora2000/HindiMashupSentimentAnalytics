/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mashup;

import java.util.ArrayList;
import java.util.Iterator;
 
/**
 *
 * @author Ecologic
 */
public class CheckSentiment {

    
    public static ArrayList<String>  MashupWords(){
    
    ArrayList<String>  mashupinput = new ArrayList<>();
    
    
    mashupinput.add("jyada");
    mashupinput.add("sirraa");
    mashupinput.add("ghatiyyaa");
    mashupinput.add("mehnga");
    mashupinput.add("bakwaas");
    mashupinput.add("vdiaa");
    mashupinput.add("pasand");
    mashupinput.add("acha");
    mashupinput.add("kamal");
    mashupinput.add("Bekaar");
    mashupinput.add("Antimicrobial");
    mashupinput.add("pehla");
    
    
    
    
    return mashupinput;
    
    
    
    } 
    //----------end 
    
    
    public static void  runSentimentAnalysis(){
    
        ArrayList<String>  mashupinput = CheckSentiment.MashupWords();
        String topic = "";
        Iterator itr = mashupinput.iterator();
        
         while(itr.hasNext()){
                System.out.println(itr.next());
                topic = itr.next().toString();
                ArrayList<String> tweets = MashTweetManager.getTweets(topic);
                MashNLP.init();
                
                for(String tweet : tweets) {
            
            
                       System.out.println(tweet + " :  Sentiment  Score is : " + MashNLP.findSentiment(tweet));
            
            
            
                }
                
                
                
   
        }
    
    
    } //end of function 
    

    public static void main(String args[]){
    
        runSentimentAnalysis();  
    
    }
    
    
    
    } // end of class 

    
    
    
    
   
    
    
    
    
 
