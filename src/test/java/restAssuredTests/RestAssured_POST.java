package restAssuredTests;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssured_POST {
	
	public static void main(String[] args) {
		
//		set the base URL
		RestAssured.baseURI = "https://api.restful-api.dev/objects";
		
//		create request object
		RequestSpecification httpRequest = RestAssured.given();
		
//		request post
//		add data and body using JSON format
		JSONObject myJson = new JSONObject();
		myJson.put("name", "Apple MacBook Pro 16");

		
		JSONObject dataJson = new JSONObject();
		dataJson.put("year", 2019);
		dataJson.put("price", 1849.99);
		dataJson.put("CPU model", "Intel Core i9");
		dataJson.put("Hard disk size", "1 TB");
		
//		{
//			   "name": "Apple MacBook Pro 16",
//			   "data": {
//			      "year": 2019,
//			      "price": 1849.99,
//			      "CPU model": "Intel Core i9",
//			      "Hard disk size": "1 TB"
//			   }
//			}
		
		myJson.put("data", dataJson);
		
//		System.out.println(myJson.toString());
		
//		System.out.println(myJson.toJSONString());
		
//		JSONObject json = new JSONObject(jsonString); // Convert text to object
//		System.out.println(json.toString(4)); // Print it with specified indentation
		
//		System.out.println(json.toString(4)); 
		
		 Gson gson = new GsonBuilder().setPrettyPrinting().create();

		     // Convert the JSONObject to a formatted JSON string
		     String prettyJson = gson.toJson(myJson);

		     // Print the formatted JSON
		     System.out.println(prettyJson);

		
		
	}

}
