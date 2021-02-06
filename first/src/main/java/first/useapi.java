package first;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class useapi {

	
	public static void main(String[] args) throws UnsupportedEncodingException, UnirestException {
		
		
		// Host url
		
		
		      
	      String host = "https://free-nba.p.rapidapi.com/players/";
	      String charset = "UTF-8";
	      // Headers for a request
	      String x_rapidapi_host = "free-nba.p.rapidapi.com";
	      String x_rapidapi_key = "755e1cd39fmsh5fbf3b5326ae24fp10ad07jsn573c5130ccb2";
	      // Params
	      String s = "123";
	      
	  // Format query for preventing encoding problems
	      String query =  URLEncoder.encode(s, charset);
	      
	      HttpResponse<String> response = Unirest.get(host + query)
	    	      .header("x-rapidapi-host", x_rapidapi_host)
	    	      .header("x-rapidapi-key", x_rapidapi_key)
	    	      .asString();
	    	    
	      
	      Gson gson = new GsonBuilder().setPrettyPrinting().create();
	      JsonParser jp = new JsonParser();
	      JsonElement je = jp.parse(response.getBody().toString());
	      String prettyJsonString = gson.toJson(je);
	      System.out.println(prettyJsonString);
	    	      
	    	     
	    	    			
	    	      

	}

}
