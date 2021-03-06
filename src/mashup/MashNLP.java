/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mashup;

/**
 *
 * @author Ecologic
 */

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;
import java.io.InputStream;
import java.util.Properties;



public class MashNLP {
    
    
    static StanfordCoreNLP pipeline;
    /** 
     * 
     * 
     */
     
         private final Properties configProp = new Properties();
          
        static  InputStream ins = null;
         
    public static void init() {
        
       
    
        pipeline = new StanfordCoreNLP("MyPropFile.properties");
    
    
    }

    /**
     *  Function to Find Sentiment from the Mashup Based Tweets :
     * 
     * @param tweet
     * @return 
     */
    
    
    
    
    public static int findSentiment(String tweet) {

        int mainSentiment = 0;
        
        try{
        
         if (tweet != null && tweet.length() > 0) {
            int longest = 0;
            Annotation annotation = pipeline.process(tweet);
          
            for (CoreMap sentence : annotation
                    .get(CoreAnnotations.SentencesAnnotation.class)) {
                Tree tree = sentence
                        .get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
                int sentiment = RNNCoreAnnotations.getPredictedClass(tree);
                String partText = sentence.toString();
                System.out.println(partText);
                if (partText.length() > longest) {
                    mainSentiment = sentiment;
                    longest = partText.length();
                }

            }
        }
       
        
        
        }catch(Exception e ){
            
           
        }
        
       
        
        
       if (mainSentiment == 2 || mainSentiment > 4 || mainSentiment < 0) {
            return 0;
        }else {
        return mainSentiment;
       }
    }
}