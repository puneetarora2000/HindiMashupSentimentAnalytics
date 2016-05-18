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
    mashupinput.add("siraah");
    mashupinput.add("sohna");
    mashupinput.add("att");
    mashupinput.add("atth");
    mashupinput.add("kaim");
    mashupinput.add("bahut sohna");
    mashupinput.add("gud");
    mashupinput.add("g8");
    mashupinput.add("khoobsorat");
    mashupinput.add("khubsurat");
    mashupinput.add("khubsorat");
    mashupinput.add("khatam");
    mashupinput.add("pataka");
    mashupinput.add("chakma");
    mashupinput.add("chakva");
    mashupinput.add("athra");
    mashupinput.add("atra");
    mashupinput.add("mehnti");
    mashupinput.add("kaama");
    mashupinput.add("gahpata");
    mashupinput.add("hoor");
    mashupinput.add("hoorpari");
    mashupinput.add("sunakhi");
    mashupinput.add("anakh");
    mashupinput.add("ankhila");
    mashupinput.add("sacha");
    mashupinput.add("sucha");
    mashupinput.add("pakka");
    mashupinput.add("gadar");
    mashupinput.add("aag");
    mashupinput.add("patola");
    mashupinput.add("desi");
    mashupinput.add("jagadi");
    mashupinput.add("schimi");
    mashupinput.add("schemie");
    mashupinput.add("adaakar");
    mashupinput.add("velli");
    mashupinput.add("hassa");
    mashupinput.add("hasa");
    mashupinput.add("mazak");
    mashupinput.add("mazakia");
    mashupinput.add("majak");
    mashupinput.add("majakia");
    mashupinput.add("jadoo");
    mashupinput.add("jadu");
    mashupinput.add("jadugar");
    mashupinput.add("ucha");
    mashupinput.add("uchai");
    mashupinput.add("halka");
    mashupinput.add("haula");
    mashupinput.add("jadugar");
    mashupinput.add("daryadil");
    mashupinput.add("deewana");
    mashupinput.add("diwana");
    mashupinput.add("pyar");
    mashupinput.add("pyaar");
    mashupinput.add("muskan");
    mashupinput.add("muskurahat");
    mashupinput.add("mithas");
    mashupinput.add("mithaas");
    mashupinput.add("mithai");
    mashupinput.add("vishaal");
    mashupinput.add("bada");
    mashupinput.add("parshansa");
    mashupinput.add("vadaeyi");
    mashupinput.add("rabb");
    mashupinput.add("farishte");
    mashupinput.add("bhagwaan");
    mashupinput.add("pharishte");
    mashupinput.add("devta");
    mashupinput.add("pooja");
    mashupinput.add("puja");
    mashupinput.add("path");
    mashupinput.add("mehak");
    mashupinput.add("mehk");
    mashupinput.add("pavitar");
    mashupinput.add("saaf");
    mashupinput.add("saafsuthra");
    mashupinput.add("paavan");
    mashupinput.add("paak");
    mashupinput.add("subh");
    mashupinput.add("jeet");
    mashupinput.add("narmai");
    mashupinput.add("shonk");
    mashupinput.add("izzat");
    mashupinput.add("izzatdar");
    mashupinput.add("milnsar");
    mashupinput.add("tyohar");
    mashupinput.add("manmani");
    mashupinput.add("bahadur");
    mashupinput.add("bahaduri");
    mashupinput.add("veer");
    mashupinput.add("nidar");
    mashupinput.add("thanda");
    mashupinput.add("poshtik");
    mashupinput.add("sehat");
    mashupinput.add("sehatmund");
    mashupinput.add("tandrust");
    mashupinput.add("takatvar");
    mashupinput.add("balvaan");
    mashupinput.add("takat");
    mashupinput.add("hoshiar");
    mashupinput.add("upayog");
    mashupinput.add("sundar");
    mashupinput.add("kranti");
    mashupinput.add("krantikari");
    mashupinput.add("aazaad");
    mashupinput.add("aazaadi");
    mashupinput.add("sukhmai");
    mashupinput.add("shanti");
    mashupinput.add("sona");
    mashupinput.add("heera");
    mashupinput.add("aasaan");
    mashupinput.add("lamba");
    mashupinput.add("tezz");
    mashupinput.add("better");
    mashupinput.add("betterment");
    mashupinput.add("betterly");
    mashupinput.add("best");
    mashupinput.add("fine");
    mashupinput.add("finer");
    mashupinput.add("finely");
    mashupinput.add("finest");
    mashupinput.add("good");
    mashupinput.add("goodish");
    mashupinput.add("excellent");
    mashupinput.add("excellence");
    mashupinput.add("excel");
    mashupinput.add("great");
    mashupinput.add("greatly");
    mashupinput.add("greatness");
    mashupinput.add("excellently");
    mashupinput.add("fab");
    mashupinput.add("fabulous");
    mashupinput.add("fabulously");
    mashupinput.add("awesome");
    mashupinput.add("awsum");
    mashupinput.add("awesomeness");
    mashupinput.add("amazing");
    mashupinput.add("amazingly");
    mashupinput.add("amazed");
    mashupinput.add("astonish");
    mashupinput.add("astonishingly");
    mashupinput.add("astonished");
    mashupinput.add("astound);
    mashupinput.add("astounded");
    mashupinput.add("astoundingly");
    mashupinput.add("outstanding");
    mashupinput.add("outstandingly");
    mashupinput.add("staggerering");
    mashupinput.add("swag");
    mashupinput.add("ame inspiring");
    mashupinput.add("incredible");
    mashupinput.add("incredibility");
    mashupinput.add("incredibily");
    mashupinput.add("firstclass");
    mashupinput.add("topdrawer");
    mashupinput.add("splendid");
    mashupinput.add("splendidly");
    mashupinput.add("fantabulous");
    mashupinput.add("beaut");
    mashupinput.add("beauty");
    mashupinput.add("fantastic");
    mashupinput.add("fantasy");
    mashupinput.add("fantasticly");
    mashupinput.add("magnificent");
    mashupinput.add("magnificent");
    mashupinput.add("magnificent");
    mashupinput.add("magnificent");
    mashupinput.add("magnificent");
    mashupinput.add("magnificent");
    
    
    
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

    
    
    
    
   
    
    
    
    
 
