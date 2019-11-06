package twitter4j;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;

import essai.extraction.tweet.Object;
public class retweetUser
{
	 public static void main(String[] args) 
	 {
		Twitter twitter = new TwitterFactory().getInstance();
		

		
		try {
			
			
			
			//recuperer les retweets d'un tweet (en donnant l'id du tweet en paramettre)
		    String rt = "28965133673832449";
		    Long var = Long.parseLong(rt);
			List<Status> tweets = new ArrayList<>();
			tweets =  twitter.getRetweets(var);
			//System.out.println(tweets);
		    	  
			
			// Recuperer le nombre de retweets d'un tweet
			int nbr_retweet = tweets.size();
			System.out.println(nbr_retweet);
		    		
					
					
					
					
					            
		} catch (TwitterException te) {
			// TODO Auto-generated catch block
			
		}
					            
					        }}
	 
		 
	 

