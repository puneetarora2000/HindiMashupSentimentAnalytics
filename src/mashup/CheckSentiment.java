/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mashup;

import java.util.ArrayList;
/**
 *
 * @author Ecologic
 */
public class CheckSentiment {

    public static void main(String[] args) {
        String topic = "Smartphones India ";
        ArrayList<String> tweets = MashTweetManager.getTweets(topic);
        MashNLP.init();
        for(String tweet : tweets) {
            System.out.println(tweet + " : " + MashNLP.findSentiment(tweet));
        }
    }
}
