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
    mashupinput.add("jauntiness");
    mashupinput.add("pert");
    mashupinput.add("pertly");
    mashupinput.add("pertness");
    mashupinput.add("cheeky");
    mashupinput.add("saucy");
    mashupinput.add("cheekily");
    mashupinput.add("cheekiness");
    mashupinput.add("sauce");
    mashupinput.add("sauciness");
    mashupinput.add("saucily");
    mashupinput.add("pert");
    mashupinput.add("pertly");
    mashupinput.add("pertness");
    mashupinput.add("ace");
    mashupinput.add("cracker");
    mashupinput.add("a-one");
    mashupinput.add("breezing");
    mashupinput.add("first-rate");
    mashupinput.add("cracker");
    mashupinput.add("champ");
    mashupinput.add("champion");
    mashupinput.add("champpionship");
    mashupinput.add("genious");
    mashupinput.add("hotshot");
    mashupinput.add("megastar");
    mashupinput.add("star");
    mashupinput.add("superstar");
    mashupinput.add("proficient");
    mashupinput.add("proficiently");
    mashupinput.add("proficientness");
    mashupinput.add("expert");
    mashupinput.add("expertly");
    mashupinput.add("expertise");
    mashupinput.add("expertness");
    mashupinput.add("sensational");
    mashupinput.add("sensation");
    mashupinput.add("sensationalism");
    mashupinput.add("sensationally");
    mashupinput.add("sansationalise");
    mashupinput.add("maven");
    mashupinput.add("mavin");
    mashupinput.add("rockstar");
    mashupinput.add("virtuso");
    mashupinput.add("whiz");
    mashupinput.add("master");
    mashupinput.add("mastery");
    mashupinput.add("mastership");
    mashupinput.add("mastering");
    mashupinput.add("masterful");
    mashupinput.add("mastered");
    mashupinput.add("masterly");
    mashupinput.add("capain");
    mashupinput.add("chief");
    mashupinput.add("overcome");
    mashupinput.add("wizard");
    mashupinput.add("wizardly");
    mashupinput.add("charming");
    mashupinput.add("chatmingness");
    mashupinput.add("charmer");
    mashupinput.add("charmful");
    mashupinput.add("charmless");
    mashupinput.add("charmed");
    mashupinput.add("charmingly");
    mashupinput.add("magical");
    mashupinput.add("magically");
    mashupinput.add("sorcerous");
    mashupinput.add("necromancer");
    mashupinput.add("necromancy");
    mashupinput.add("consummate");
    mashupinput.add("complete");
    mashupinput.add("completion");
    mashupinput.add("completeness");
    mashupinput.add("completed");
    mashupinput.add("completing");
    mashupinput.add("completely");
    mashupinput.add("pure");
    mashupinput.add("pureness");
    mashupinput.add("purely");
    mashupinput.add("purify");
    mashupinput.add("purified");
    mashupinput.add("purification");
    mashupinput.add("purifier");
    mashupinput.add("purifying");
    mashupinput.add("perfect");
    mashupinput.add("perfecter");
    mashupinput.add("perfection");
    mashupinput.add("perfectness");
    mashupinput.add("perfectly");
    mashupinput.add("perfected");
    mashupinput.add("perfectible");
    mashupinput.add("spark");
    mashupinput.add("sparker");
    mashupinput.add("sparky");
    mashupinput.add("sparkle");
    mashupinput.add("sparkler");
    mashupinput.add("sparking");
    mashupinput.add("thorough");
    mashupinput.add("thoroughly");
    mashupinput.add("winner");
    mashupinput.add("win");
    mashupinput.add("success");
    mashupinput.add("victor");
    mashupinput.add("successful");
    mashupinput.add("victory");
    mashupinput.add("victorious");
    mashupinput.add("bravo");
    mashupinput.add("bravo");
    mashupinput.add("brava");
    mashupinput.add("weldone");
    mashupinput.add("admirer");
    mashupinput.add("admire");
    mashupinput.add("boost");
    mashupinput.add("booster");
    mashupinput.add("hero");
    mashupinput.add("heroism");
    mashupinput.add("heroic");
    mashupinput.add("heroical");
    mashupinput.add("inspire");
    mashupinput.add("inspirer");
    mashupinput.add("inspired");
    mashupinput.add("inspiring");
    mashupinput.add("cheer");
    mashupinput.add("cheering");
    mashupinput.add("cheerer");
    mashupinput.add("cheerful");
    mashupinput.add("cheerily");
    mashupinput.add("inspire");
    mashupinput.add("inspiring");
    mashupinput.add("inspiringly");
    mashupinput.add("inspiration");
    mashupinput.add("inspirer");
    mashupinput.add("inspiring");
    mashupinput.add("invigorate");
    mashupinput.add("invigorator");
    mashupinput.add("liven");
    mashupinput.add("enliven");
    mashupinput.add("enlivener");
    mashupinput.add("enlivenment");
    mashupinput.add("enlivening");
    mashupinput.add("enlivened");
    mashupinput.add("reinvigorate");
    mashupinput.add("reinvigorated");
    mashupinput.add("reinvigoration");
    mashupinput.add("revolution");
    mashupinput.add("revolutionism");
    mashupinput.add("revolutionist");
    mashupinput.add("revolutionary");
    mashupinput.add("appease");
    mashupinput.add("appeaser");
    mashupinput.add("appeasement");
    mashupinput.add("appeasable");
    mashupinput.add("appeasing");
    mashupinput.add("aristocart");
    mashupinput.add("pacify");
    mashupinput.add("pacifier");
    mashupinput.add("euphoria");
    mashupinput.add("euphory");
    mashupinput.add("euphorically");
    mashupinput.add("blithe");
    mashupinput.add("blithely");
    mashupinput.add("gayy");
    mashupinput.add("gayly");
    mashupinput.add("happy");
    mashupinput.add("happiness");
    mashupinput.add("happily");
    mashupinput.add("wellchosen");
    mashupinput.add("felicitous");
    mashupinput.add("felicitate");
    mashupinput.add("congrats");
    mashupinput.add("congo");
    mashupinput.add("congratulation");
    mashupinput.add("congratulate");
    mashupinput.add("jubiliant");
    mashupinput.add("jubilance");
    mashupinput.add("jubilancy");
    mashupinput.add("jubilate");
    mashupinput.add("jubilantly");
    mashupinput.add("jubilation");
    mashupinput.add("jubliee");
    mashupinput.add("mirthful");
    mashupinput.add("mirth");
    mashupinput.add("mirthfully");
    mashupinput.add("funny");
    mashupinput.add("funnily");
    mashupinput.add("funniness");
    mashupinput.add("funniness");
    mashupinput.add("yahoo");
    mashupinput.add("hoorah");
    mashupinput.add("hooray");
    mashupinput.add("hurray");
    mashupinput.add("hurrah");
    mashupinput.add("whoopee");
    mashupinput.add("yipee");
    mashupinput.add("samsung gud");
    mashupinput.add("samsung siraa");
    mashupinput.add("samsung awsum");
    mashupinput.add("samsung vadiaa");
    mashupinput.add("samsung badiyaa");
    mashupinput.add("samsung acha");
    mashupinput.add("iphone gud");
    mashupinput.add("iphone siraa");
    mashupinput.add("iphone awsum");
    mashupinput.add("iphone vadiaa");
    mashupinput.add("iphone badiyaa");
    mashupinput.add("iphone acha");
    mashupinput.add("htc acha");
    mashupinput.add("htc badiyaa");
    mashupinput.add("htc siraa");
    mashupinput.add("htc awsum");
    mashupinput.add("htc gud");
    mashupinput.add("htc vadiaa");
    mashupinput.add("bura");
    mashupinput.add("mada");
    mashupinput.add("rona");
    mashupinput.add("galat");
    mashupinput.add("galati");
    mashupinput.add("gila");
    mashupinput.add("gila-shikwa");
    mashupinput.add("shikwa");
    mashupinput.add("afsoos");
    mashupinput.add("udaas");
    mashupinput.add("udaasi");
    mashupinput.add("fuss");
    mashupinput.add("duhai");
    mashupinput.add("duhayi");
    mashupinput.add("kalajadoo");
    mashupinput.add("vigdya");
    mashupinput.add("gund");
    mashupinput.add("kachra");
    mashupinput.add("kabaad");
    mashupinput.add("landu");
    mashupinput.add("ghatiya");
    mashupinput.add("ghatta");
    mashupinput.add("ghanta");
    mashupinput.add("nalayak");
    mashupinput.add("ghadha");
    mashupinput.add("doobna");
    mashupinput.add("doobgya");
    mashupinput.add("nahshi");
    mashupinput.add("nai");
    mashupinput.add("nahi");
    mashupinput.add("kadma");
    mashupinput.add("kalank");
    mashupinput.add("teera");
    mashupinput.add("bhola");
    mashupinput.add("annah");
    mashupinput.add("goonga");
    mashupinput.add("langda");
    mashupinput.add("awaara");
    mashupinput.add("shaitan");
    mashupinput.add("gunda");
    mashupinput.add("chadayi");
    mashupinput.add("kamala");
    mashupinput.add("buddu");
    mashupinput.add("budhu");
    mashupinput.add("bewafkoof");
    mashupinput.add("bewaffa");
    mashupinput.add("badmashi");
    mashupinput.add("annt");
    mashupinput.add("nasha");
    mashupinput.add("amli");
    mashupinput.add("kutt");
    mashupinput.add("kutmar");
    mashupinput.add("kutapa");
    mashupinput.add("ladayi");
    mashupinput.add("jung");
    mashupinput.add("chugli");
    mashupinput.add("chaturayi");
    mashupinput.add("chatur");
    mashupinput.add("chalak");
    mashupinput.add("galan");
    mashupinput.add("gaali");
    mashupinput.add("gaaligaloch");
    mashupinput.add("sharabi");
    mashupinput.add("mandi");
    mashupinput.add("mandbhagga");
    mashupinput.add("mandhali");
    mashupinput.add("manda");
    mashupinput.add("ghaata");
    mashupinput.add("ghatta");
    mashupinput.add("nuksaan");
    mashupinput.add("hani");
    mashupinput.add("hanikarak");
    mashupinput.add("sog");
    mashupinput.add("samshan");
    mashupinput.add("darr");
    mashupinput.add("maut");
    mashupinput.add("darauna");
    mashupinput.add("daravana");
    mashupinput.add("darpok");
    mashupinput.add("dalal");
    mashupinput.add("thug");
    mashupinput.add("thugi");
    mashupinput.add("lut");
    mashupinput.add("lutna");
    mashupinput.add("lutmaar");
    mashupinput.add("lutera");
    mashupinput.add("lootera");
    mashupinput.add("panga");
    mashupinput.add("siyapa");
    mashupinput.add("mushak");
    mashupinput.add("badboo");
    mashupinput.add("beha");
    mashupinput.add("durgand");
    mashupinput.add("attwadi");
    mashupinput.add("attvadi");
    mashupinput.add("attwad");
    mashupinput.add("attvad");
    mashupinput.add("kaayar");
    mashupinput.add("bhagoda");
    mashupinput.add("aakad");
    mashupinput.add("aakadkhor");
    mashupinput.add("bad");
    mashupinput.add("baddish");
    mashupinput.add("badly");
    mashupinput.add("badness");
    mashupinput.add("artic");
    mashupinput.add("ludicrous");
    mashupinput.add("ludicrously");
    mashupinput.add("joke");
    mashupinput.add("joker");
    mashupinput.add("joking");
    mashupinput.add("jocular");
    mashupinput.add("jocularly");
    mashupinput.add("jocularity");
    mashupinput.add("jesting");
    mashupinput.add("jocose");
    mashupinput.add("jocosity");
    mashupinput.add("jocosely");
    mashupinput.add("grotesque");
    mashupinput.add("grotesquely");
    mashupinput.add("grotesquery");
    mashupinput.add("prank");
    mashupinput.add("prankster");
    mashupinput.add("prankish");
    mashupinput.add("unfit");
    mashupinput.add("unfitly");
    mashupinput.add("unfitting");
    mashupinput.add("defective");
    mashupinput.add("defect");
    mashupinput.add("defectiveness");
    mashupinput.add("defection");
    mashupinput.add("defectionist");
    mashupinput.add("defector");
    mashupinput.add("desert");
    mashupinput.add("deserter");
    mashupinput.add("deserted");
    mashupinput.add("desertion");
    mashupinput.add("forge");
    mashupinput.add("forgery");
    mashupinput.add("forging");
    mashupinput.add("forger");
    mashupinput.add("forged");
    mashupinput.add("high-risk");
    mashupinput.add("risky");
    mashupinput.add("riskiness");
    mashupinput.add("riskily");
    mashupinput.add("wild");
    mashupinput.add("wildness");
    mashupinput.add("wilder");
    mashupinput.add("wildish");
    mashupinput.add("wildly");
    mashupinput.add("wildish");
    mashupinput.add("angry");
    mashupinput.add("anger");
    mashupinput.add("angrily");
    mashupinput.add("furious");
    mashupinput.add("furiously");
    mashupinput.add("fury");
    mashupinput.add("tempest");
    mashupinput.add("tempestous");
    mashupinput.add("tempest");
    mashupinput.add("tempestuously");
    mashupinput.add("speculative");
    mashupinput.add("speculator");
    mashupinput.add("spoiled");
    mashupinput.add("spoil");
    mashupinput.add("regret");
    mashupinput.add("regretful");
    mashupinput.add("sorrow");
    mashupinput.add("sorrowful");
    mashupinput.add("repent");
    mashupinput.add("repentance");
    mashupinput.add("tough");
    mashupinput.add("toughen");
    mashupinput.add("toughly");
    mashupinput.add("toughish");
    mashupinput.add("uncollectible");
    mashupinput.add("uncollectibly");
    mashupinput.add("unsound");
    mashupinput.add("unsoundly");
    mashupinput.add("wailing");
    mashupinput.add("wailingly");
    mashupinput.add("wailer");
    mashupinput.add("wailful");
    mashupinput.add("bawling");
    mashupinput.add("bawler");
    mashupinput.add("wimp");
    mashupinput.add("wimpy");
    mashupinput.add("wimpish");
    mashupinput.add("crybaby");
    mashupinput.add("yawling");
    mashupinput.add("mewling");
    mashupinput.add("lament");
    mashupinput.add("ululate");
    mashupinput.add("weep");
    mashupinput.add("weeping");
    mashupinput.add("weepy");
    mashupinput.add("cry");
    mashupinput.add("crier");
    mashupinput.add("outcry");
    mashupinput.add("pule");
    mashupinput.add("mewl");
    mashupinput.add("wail");
    mashupinput.add("whimper");
    mashupinput.add("inquisitive");
    mashupinput.add("faulty");
    mashupinput.add("faultiness");
    mashupinput.add("faultily");
    mashupinput.add("fault");
    mashupinput.add("counterfiet");
    mashupinput.add("faked");
    mashupinput.add("faker");
    mashupinput.add("fake");
    mashupinput.add("copy");
    mashupinput.add("replicate");
    mashupinput.add("hammered");
    mashupinput.add("dark");
    mashupinput.add("darkish");
    mashupinput.add("deplorable");
    mashupinput.add("deplore");
    mashupinput.add("dingy");
    mashupinput.add("dinge");
    mashupinput.add("dismal");
    mashupinput.add("dismally");
    mashupinput.add("stressing");
    mashupinput.add("stressor");
    mashupinput.add("drear");
    mashupinput.add("drearly");
    mashupinput.add("drearly");
    mashupinput.add("drearily");
    mashupinput.add("gloomy");
    mashupinput.add("gloom");
    mashupinput.add("gloomful");
    mashupinput.add("gloominess");
    mashupinput.add("gloomily");
    mashupinput.add("down");
    mashupinput.add("downer");
    mashupinput.add("downness");
    mashupinput.add("downy");
    mashupinput.add("dispirited");
    mashupinput.add("dispirit");
    mashupinput.add("depress");
    mashupinput.add("dismay");
    mashupinput.add("deject");
    mashupinput.add("disconsolate");
    mashupinput.add("disconsolately");
    mashupinput.add("down in the mouth");
    mashupinput.add("downcast");
    mashupinput.add("downcastly");
    mashupinput.add("downhearted");
    mashupinput.add("downheartedly");
    mashupinput.add("grim");
    mashupinput.add("grimness");
    mashupinput.add("grimmish");
    mashupinput.add("grimly");
    mashupinput.add("low");
    mashupinput.add("lowness");
    mashupinput.add("low-spirited");
    mashupinput.add("sulk");
    mashupinput.add("sulker");
    mashupinput.add("sulky");
    mashupinput.add("sulkily");
    mashupinput.add("sulker");
    mashupinput.add("huff");
    mashupinput.add("sluggish");
    mashupinput.add("slug");
    mashupinput.add("good for naught");
    mashupinput.add("good for nothing");
    mashupinput.add("huh");
    mashupinput.add("meritless");
    mashupinput.add("no-count");
    mashupinput.add("no-good");
    mashupinput.add("no-account");
    mashupinput.add("pitiful");
    mashupinput.add("pathetic");
    mashupinput.add("miserable");
    mashupinput.add("poor");
    mashupinput.add("wretched");
    mashupinput.add("sad");
    mashupinput.add("saddish");
    mashupinput.add("sadly");
    mashupinput.add("sadder");
    mashupinput.add("babied");
    mashupinput.add("babyish");
    mashupinput.add("baffle");
    mashupinput.add("buthered");
    mashupinput.add("crossed");
    mashupinput.add("crosswise");
    mashupinput.add("crossways");
    mashupinput.add("elude");
    mashupinput.add("eluding");
    mashupinput.add("elusive");
    mashupinput.add("foiled");
    mashupinput.add("foliate");
    mashupinput.add("scothed");
    mashupinput.add("thwart");
    mashupinput.add("bobble");
    mashupinput.add("botched");
    mashupinput.add("botchy");
    mashupinput.add("incompetent");
    mashupinput.add("clumsy");
    mashupinput.add("bumbled");
    mashupinput.add("bumbler");
    mashupinput.add("bungled");
    mashupinput.add("bungler");
    mashupinput.add("butcher");
    mashupinput.add("cockered");
    mashupinput.add("coddled");
    mashupinput.add("coddle");
    mashupinput.add("corrupt");
    mashupinput.add("cosseted");
    mashupinput.add("deflowered");
    mashupinput.add("despoil");
    mashupinput.add("despoiler");
    mashupinput.add("fumble");
    mashupinput.add("fumbler");
    mashupinput.add("goofed up");
    mashupinput.add("impaired");
    mashupinput.add("itched");
    mashupinput.add("itchy");
    mashupinput.add("rubbed");
    mashupinput.add("scracthed");
    mashupinput.add("loused up");
    mashupinput.add("marred");
    mashupinput.add("messy");
    mashupinput.add("mishandled");
    mashupinput.add("mucked up");
    mashupinput.add("muffed");
    mashupinput.add("muff");
    mashupinput.add("pamper");
    mashupinput.add("plunder");
    mashupinput.add("pollutant");
    mashupinput.add("pollution");
    mashupinput.add("polluter");
    mashupinput.add("queered");
    mashupinput.add("queerish");
    mashupinput.add("odd");
    mashupinput.add("violate");
    mashupinput.add("ravish");
    mashupinput.add("screw");
    mashupinput.add("violent");
    mashupinput.add("violated");
    mashupinput.add("tearing");
    mashupinput.add("charging");
    mashupinput.add("burden");
    mashupinput.add("vitiate");
    mashupinput.add("vitiation");
    mashupinput.add("sucked");
    mashupinput.add("suck");
    mashupinput.add("elusive");
    mashupinput.add("goon");
    mashupinput.add("hard");
    mashupinput.add("hardish");
    mashupinput.add("backbreaking");
    mashupinput.add("difficult");
    mashupinput.add("unmanageable");
    mashupinput.add("hoodlum");
    mashupinput.add("knot");
    mashupinput.add("knotty");
    mashupinput.add("problematic");
    mashupinput.add("punk");
    mashupinput.add("punkish");
    mashupinput.add("roughneck");
    mashupinput.add("rowdy");
    mashupinput.add("rowdiness");
    mashupinput.add("rowdily");
    mashupinput.add("rough");
    mashupinput.add("ruffian");
    mashupinput.add("rugged");
    mashupinput.add("ruggedise");
    mashupinput.add("furrowed");
    mashupinput.add("wrinkled");
    mashupinput.add("strict");
    mashupinput.add("strictly");
    mashupinput.add("tough");
    mashupinput.add("sacked");
    mashupinput.add("fire");
    mashupinput.add("fired");
    mashupinput.add("ravage");
    mashupinput.add("looted");
    mashupinput.add("looter");
    mashupinput.add("ransack");
    mashupinput.add("rifled");
    mashupinput.add("riflery");
    mashupinput.add("forayed");
    mashupinput.add("forayer");
    mashupinput.add("indispose");
    mashupinput.add("hesitancy");
    mashupinput.add("hesitation");
    mashupinput.add("reluctance");
    mashupinput.add("reluctant");
    mashupinput.add("disqualify");
    mashupinput.add("fallaciously");
    mashupinput.add("fallacy");
    mashupinput.add("fraud");
    mashupinput.add("fraudulent");
    mashupinput.add("deceitful");
    mashupinput.add("double-faced");
    mashupinput.add("double-tongued");
    mashupinput.add("debatable");
    mashupinput.add("debate");
    mashupinput.add("subtle");
    mashupinput.add("subtlely");
    mashupinput.add("insidious");
    mashupinput.add("beguiling");
    mashupinput.add("tangle");
    mashupinput.add("tangly");
    mashupinput.add("torture");
    mashupinput.add("torturously");
    mashupinput.add("convolution");
    mashupinput.add("twist");
    mashupinput.add("twister");
    mashupinput.add("twisty");
    mashupinput.add("convolute");
    
    
    
    return mashupinput;
    
    
    
    } 
    //----------end 
    
     public static void  runSentimentAnalysis() throws IOException{
            CSVWriter writer  =null;
        String[] sentimentText = { "Very Negative","Negative", "Neutral", "Positive", "Very Positive"};
        //String[] sentimentText = { "Very Positive","Positive", "Neutral", "Negative", "Very Negative"};
        //String[] sentimentText = { "Positive", "Neutral", "Negative"};
        
        ArrayList<String>  mashupinput = CheckSentiment.MashupWords();
        String topic = "";
        Iterator itr = mashupinput.iterator();
        try {            
              writer = new CSVWriter(new FileWriter(Common.outputfile));
        } catch (IOException ex) {
            Logger.getLogger(CheckSentiment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         while(itr.hasNext()){
                System.out.println(itr.next());
                topic = itr.next().toString();
              
                ArrayList<String> tweetsData = MashTweetManager.getTweets(topic);
                MashNLP.init();
                
                for(String tweet : tweetsData) {
                    int score = MashNLP.findSentiment(tweet.trim());
                    System.out.println(sentimentText[score]);
                       writer.writeNext(tweet + ","+score);
                       System.out.println(tweet + " :  Sentiment  is  : " +sentimentText[score] );
            
                       
            
                }
                
                
                
   
        }
         
         writer.close();
    
    
    }  
     
      //end of function 
    

    public static void main(String args[]){
    
        runSentimentAnalysis();  
    
    }
    
    
    
    } // end of class 

    
    
    
    
   
    
    
    
    
 
