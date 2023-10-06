package restAssuredTests;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TrelloCreateMaxLists {

	public static void main(String[] args) {
		
		String key = "f11847f2f71ddb7991c2447ee8d9595e";
		String token = "ATTAef1a70cb760c71ca7968dff127490a51a1cfd970183b6101bfd6f56657d5147aE71EBF89";
		String boardId = "6514ba1c35a7bbf26cac26b2";
		int numLists = 0;
		
//		rest assured based URI
		RestAssured.baseURI = "https://api.trello.com/1/lists";
		
//		create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.headers("Content-Type", "application/json");
		
//		create lists until the max limit is reached
		while(true) {
			JSONObject requestBody = new JSONObject();
			requestBody.put("name", "Create a Board Test" + (numLists + 1));
			requestBody.put("idBoard", boardId);
			requestBody.put("key", key);
			requestBody.put("token", token);
			
			Response myResponse = httpRequest.body(requestBody.toString()).post();
			
			int statusCode = myResponse.getStatusCode();
			
			if(statusCode == 200) {
				numLists++;
				System.out.println("List " + numLists + " created");
			} else {
				System.out.println("Failed to create list");
//				print the response for the further inspection
				myResponse.prettyPrint();
//				stop creating lists if an error occurs
				break;
			}
			
		}
		
		System.out.println("Number of lists created: " + numLists);
				
		
	}
}
