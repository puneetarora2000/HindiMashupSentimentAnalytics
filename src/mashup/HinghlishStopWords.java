/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mashup;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Ecologic
 */
public class HinghlishStopWords {
    
    public static String[] stopwords ={"ki", "ka", "mein", "hai", "ye", "aur", "se", "hain", "ko", "par", "iss", "hota", "jo",
    "kar", "ki", "gya", "ne", "bni", "toh", "diya", "hota", "iska", "tha", "karna", "tak", "vale", "sath", "baad", "aap", "tum", 
    "kuch", "kisi", "sabse", "hone",    "the", "kai", "kai", "karein", "apne", "unke", "thi", "jaise", "abhi", "uss", "sakta",
    "rakhe", "pe", "na", "aur", "tarah", "sabhi", "a", "about", "above", "across", "after", "afterwards", "again", "against", "all",
    "almost", "alone", "along", "already", "also","although","always","am","among", "amongst", "amoungst", "amount",  "an", "and", 
    "another", "any","anyhow","anyone","anything","anyway", "anywhere", "are", "around", "as",  "at", "back","be","became", 
    "because","become","becomes", "becoming", "been", "before", "beforehand", "behind", "being", "below", "beside", "besides", 
    "between", "beyond", "bill", "both", "bottom","but", "by", "call", "can", "cannot", "cant", "co", "con", "could", "couldnt",
    "cry", "de", "describe", "detail", "do", "done", "down", "due", "during", "each", "eg", "eight", "either", "eleven","else",
    "elsewhere", "empty", "enough", "etc", "even", "ever", "every", "everyone", "everything", "everywhere", "except", "few", 
    "fifteen", "fify", "fill", "find", "fire", "first", "five", "for", "former", "formerly", "forty", "found", "four", "from", 
    "front", "full", "further", "get", "give", "go", "had", "has", "hasnt",
    "have", "he", "hence", "her", "here", "hereafter", "hereby", "herein", "hereupon", "hers", "herself", 
    "him", "himself", "his", "how", "however", "hundred", "ie", "if", "in", "inc", "indeed", "interest", "into", 
    "is", "it", "its", "itself", "keep", "last", "latter", "latterly", "least", "less", "ltd", "made", "many", 
    "may", "me", "meanwhile", "might", "mill", "mine", "more", "moreover", "most", "mostly", "move", "much", "must", 
    "my", "myself", "name", "namely", "neither", "never", "nevertheless", "next", "nine", "no", "nobody", "none", 
    "noone", "nor", "not", "nothing", "now", "nowhere", "of", "off", "often", "on", "once", "one", "only", "onto", 
    "or", "other", "others", "otherwise", "our", "ours", "ourselves", "out", "over", "own","part", "per", "perhaps",
    "please", "put", "rather", "re", "same", "see", "seem", "seemed", "seeming", "seems", "serious", "several", "she",
    "should", "show", "side", "since", "sincere", "six", "sixty", "so", "some", "somehow", "someone", "something", 
    "sometime", "sometimes", "somewhere", "still", "such", "system", "take", "ten", "than", "that", "the", "their", 
    "them", "themselves", "then", "thence", "there", "thereafter", "thereby", "therefore", "therein", "thereupon", 
    "these", "they", "thickv", "thin", "third", "this", "those", "though", "three", "through", "throughout", "thru", 
    "thus", "to", "together", "too", "top", "toward", "towards", "twelve", "twenty", "two", "un", "under", "until", 
    "up", "upon", "us", "very", "via", "was", "we", "well", "were", "what", "whatever", "when", "whence", "whenever",
    "where", "whereafter", "whereas", "whereby", "wherein", "whereupon", "wherever", "whether", "which", "while", 
    "whither", "who", "whoever", "whole", "whom", "whose", "why", "will", "with", "within", "without", "would", "yet",
    "you", "your", "yours", "yourself", "yourselves","1","2","3","4","5","6","7","8","9","10","1.","2.","3.","4.","5.","6.","11",
    "7.","8.","9.","12","13","14","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
    "terms","CONDITIONS","conditions","values","interested.","care","sure","!","@","#","$","%","^","&","*","(",")","{","}","[","]",":",";",",","<",">","/","?","_","-","+","=",
    "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
    "contact","grounds","buyers","tried","said,","plan","value","principle.","forces","sent:","is,","was","like",
    "discussion","tmus","diffrent.","layout","area.","thanks","thankyou","hello","bye","rise","fell","fall","psqft.","http://","km","miles"};
    private static String fixString;


    @SuppressWarnings("unchecked")
    public static String removeStopWords(String paragraph) throws IOException{
    Scanner paragraph1=new Scanner( paragraph );
    String newtext="";
    Map map = new TreeMap();
    Integer ONE = new Integer(1);
    while(paragraph1.hasNext()) {
        int flag=1;
        fixString=paragraph1.next();
        fixString=fixString.toLowerCase();
        for(int i=0;i<stopwords.length;i++) {
            if(fixString.equals(stopwords[i])) {
                flag=0;
            }
        }
        if(flag!=0) {
            newtext=newtext+fixString+" ";  
        }
            if (fixString.length() > 0) {
            Integer frequency = (Integer) map.get(fixString);
            if (frequency == null) {
                frequency = ONE;
            } else {
                int value = frequency.intValue();
                frequency = new Integer(value + 1);
            }
            map.put(fixString, frequency);                 
            }                     
    }
    return newtext;
}


}
