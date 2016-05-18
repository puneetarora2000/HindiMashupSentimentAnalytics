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
    mashupinput.add("astound");
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
    mashupinput.add("magnificence");
    mashupinput.add("magnificently");
    mashupinput.add("magnificentness");
    mashupinput.add("grand");
    mashupinput.add("grandly");
    mashupinput.add("grandness");
    mashupinput.add("heaven");
    mashupinput.add("heavenly");
    mashupinput.add("heavenward");
    mashupinput.add("celestial");
    mashupinput.add("nirvana");
    mashupinput.add("shangri-la");
    mashupinput.add("marvel");
    mashupinput.add("marvelous");
    mashupinput.add("teriffic");
    mashupinput.add("terficness");
    mashupinput.add("teriffically");
    mashupinput.add("tremendous");
    mashupinput.add("tremendously");
    mashupinput.add("enormous");
    mashupinput.add("enormously");
    mashupinput.add("wonder");
    mashupinput.add("wonderful");
    mashupinput.add("wonderness");
    mashupinput.add("wonderous");
    mashupinput.add("improbable");
    mashupinput.add("briliant");
    mashupinput.add("brilliantly");
    mashupinput.add("brilliance");
    mashupinput.add("brilliantness");
    mashupinput.add("superb");
    mashupinput.add("superbly");
    mashupinput.add("superbness");
    mashupinput.add("glory");
    mashupinput.add("glorious");
    mashupinput.add("glorify");
    mashupinput.add("lively");
    mashupinput.add("liveliness");
    mashupinput.add("majestic");
    mashupinput.add("majesty");
    mashupinput.add("majestically");
    mashupinput.add("gallant");
    mashupinput.add("imperial");
    mashupinput.add("lofty");
    mashupinput.add("loftily");
    mashupinput.add("olympian");
    mashupinput.add("olympia");
    mashupinput.add("olympus");
    mashupinput.add("purpurate");
    mashupinput.add("purply");
    mashupinput.add("peachy");
    mashupinput.add("royal");
    mashupinput.add("royalist");
    mashupinput.add("royally");
    mashupinput.add("regal");
    mashupinput.add("ideal");
    mashupinput.add("idealistic");
    mashupinput.add("idealise");
    mashupinput.add("ideally");
    mashupinput.add("prominent");
    mashupinput.add("prominence");
    mashupinput.add("prominently");
    mashupinput.add("noble");
    mashupinput.add("nobility");
    mashupinput.add("innoble");
    mashupinput.add("ennoble");
    mashupinput.add("ennoblement");
    mashupinput.add("dignify");
    mashupinput.add("dignification");
    mashupinput.add("dignified");
    mashupinput.add("gentleness");
    mashupinput.add("gently");
    mashupinput.add("gentle");
    mashupinput.add("gentelity");
    mashupinput.add("entitle");
    mashupinput.add("entitled");
    mashupinput.add("entitlement");
    mashupinput.add("towering");
    mashupinput.add("towerness");
    mashupinput.add("towering");
    mashupinput.add("sublime");
    mashupinput.add("sublimate");
    mashupinput.add("sublimity");
    mashupinput.add("sublimation");
    mashupinput.add("sublimeness");
    mashupinput.add("sublimed");
    mashupinput.add("sublimely");
    mashupinput.add("grandeur");
    mashupinput.add("adorable");
    mashupinput.add("adore");
    mashupinput.add("adorebly");
    mashupinput.add("adorebility");
    mashupinput.add("love");
    mashupinput.add("lovely");
    mashupinput.add("loveliness");
    mashupinput.add("merry");
    mashupinput.add("merrily");
    mashupinput.add("merriness");
    mashupinput.add("refresher");
    mashupinput.add("refreshing");
    mashupinput.add("refreshingly");
    mashupinput.add("refreshment");
    mashupinput.add("zip");
    mashupinput.add("zippy");
    mashupinput.add("bounce");
    mashupinput.add("bouncy");
    mashupinput.add("bouncing");
    mashupinput.add("pep");
    mashupinput.add("peppy");
    mashupinput.add("pepiness");
    mashupinput.add("spirited");
    mashupinput.add("spiritedness");
    mashupinput.add("spirit");
    mashupinput.add("spirtist");
    mashupinput.add("spiritise");
    mashupinput.add("spiritual");
    mashupinput.add("spiritous");
    mashupinput.add("festive");
    mashupinput.add("festivity");
    mashupinput.add("festiveness");
    mashupinput.add("festal");
    mashupinput.add("fest");
    mashupinput.add("festally");
    mashupinput.add("jolly");
    mashupinput.add("jollity");
    mashupinput.add("jollify");
    mashupinput.add("jollily");
    mashupinput.add("jolliness");
    mashupinput.add("fair");
    mashupinput.add("fairly");
    mashupinput.add("fairness");
    mashupinput.add("jovial");
    mashupinput.add("joviallity");
    mashupinput.add("jovialness");
    mashupinput.add("jovially");
    mashupinput.add("jocund");
    mashupinput.add("jocundity");
    mashupinput.add("jocundly");
    mashupinput.add("crispy");
    mashupinput.add("crisp");
    mashupinput.add("crispen");
    mashupinput.add("crispiness");
    mashupinput.add("crisply");
    mashupinput.add("jaunt");
    mashupinput.add("jauntily");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    mashupinput.add("jaunty");
    
    
    
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

    
    
    
    
   
    
    
    
    
 
