/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mashup;

import edu.stanford.nlp.ling.CoreAnnotations.NamedEntityTagAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import java.util.List;
import java.util.Properties;

/**
 * Class for Feature Collection of the Hinglish Tweets 
 * @author Ecologic
 */
public class ExtractFeatures1 {
 
    
  
    /*
     Test the Extracted Features 
    
    */
    
 public static void main(String args[]){
    
 
 Properties props = new Properties();
 
 //annotation : what it is ? 
 //tokenize :parts/words  of Tweets
 //Pos : POS taggers :Parts of Speach 
 //lemma X and  Y a subsidiary or intermediate theorem in an argument or proof.
 //dcoref coreference resolution 
props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

// read some tweetpara in the tweetpara variable
String tweetpara = " Ajj shahrukh salman khan da phone aaya jeetu arora kol....movie trailer bht vadia laggeya....kehande k bollywood ki sabse best entry hai";

// create an empty Annotation just with the given tweetpara
Annotation document = new Annotation(tweetpara);

// run all Annotators on this tweetpara
pipeline.annotate(document);

// these are all the sentences in this document
// a CoreMap is essentially a Map that uses class objects as keys and has values with custom types
List<CoreMap> sentences = document.get(SentencesAnnotation.class);

int featurePoScount = 0;
int featureNeScount = 0;
int featureWordcount = 0;



for(CoreMap sentence: sentences) {
  // traversing the words in the current sentence
  // a CoreLabel is a CoreMap with additional token-specific methods
    
  for (CoreLabel token: sentence.get(TokensAnnotation.class)) {
    // this is the tweetpara of the token
    String word = token.get(TextAnnotation.class);
    
    System.out.println("Token :"+word);
    
    // this is the POS tag of the token
    String pos = token.get(PartOfSpeechAnnotation.class);
    
     System.out.println("Pos Annotation:"+pos);
    // this is the NER label of the token
    String ne = token.get(NamedEntityTagAnnotation.class);    
    
    System.out.println("Named Enitity:"+ne);
  }
    System.out.println("FeaturesRow: "+sentence+","+featurePoScount+","+featurePoScount+","+featurePoScount );
  
}
  
 
 }
    
 

 
 
}
