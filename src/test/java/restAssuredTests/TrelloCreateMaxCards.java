package restAssuredTests;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TrelloCreateMaxCards {
	
	public static void main(String[] args) {
		
		String key = "f11847f2f71ddb7991c2447ee8d9595e";
		String token = "ATTAef1a70cb760c71ca7968dff127490a51a1cfd970183b6101bfd6f56657d5147aE71EBF89";
		String listId = "651b5769dc7950ba467272f0";
		int numLists = 0;
		
//		rest assured based URI
		RestAssured.baseURI = "https://api.trello.com/1/cards";
		
//		create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.headers("Content-Type", "application/json");
		
		int maxCards = 10000;
		int numCards = 0;
		
		while(numCards <= maxCards) {
			JSONObject requestBody = new JSONObject();
			requestBody.put("name", "Cards Test" + (numCards + 1));
			requestBody.put("idList", listId);
			requestBody.put("key", key);
			requestBody.put("token", token);
			
			Response myResponse = httpRequest.body(requestBody.toString()).post();
			
			int statusCode = myResponse.getStatusCode();
			if(statusCode == 200) {
				numCards++;
				System.out.println("Cards " + numCards + " created");
			} else {
				System.out.println("Failed to create card");
				myResponse.prettyPrint();
				break;
			}
		}
		
		System.out.println("Number of cards created: " + numCards);
		
		
		
	}

}
