/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mashup;

import java.util.ArrayList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;


/**
 *
 * @author Ecologic
 */
public class MashTweetManager {

    public static ArrayList<String> getTweets(String topic) {

        
        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
        .setOAuthAccessToken(Common.AccessToken)
        .setOAuthAccessTokenSecret(Common.AccessTokenSecret)
        .setOAuthConsumerKey(Common.ConsumerKey)
        .setOAuthConsumerSecret(Common.ConsumerSecret);
      
        
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        
        //Twitter twitter = new TwitterFactory().getInstance();
        
        
        
        
        
        //  twitter.setOAuthAccessToken(null);
         
       
        
        ArrayList<String> tweetList = new ArrayList<>();
        
        
        
        
        
        
        try {
            Query query = new Query(topic.toLowerCase().trim());
            
            query.setCount(100);
            query.setLocale("en");
             query.setLang("en");
        
            QueryResult result = null;
            
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
            
                for (Status tweet : tweets) {
                    
                     
                // Remove Special Characters 
                    // Remove stop words 
                          tweetList.add(tweet.getText().replaceAll("[^\\p{L}\\p{Z}]",""));
                
                
                }
                
            } while ((query = result.nextQuery()) != null);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return tweetList;
    }
}