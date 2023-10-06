package restAssuredTests;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;

public class RestAssured_ListAndVerifyBoardInfo {
	
	public static void main(String[] args) {
		
//		starting point
		RestAssured.given().param("key", "f11847f2f71ddb7991c2447ee8d9595e")
		.param("token", "ATTAef1a70cb760c71ca7968dff127490a51a1cfd970183b6101bfd6f56657d5147aE71EBF89")
		.get("https://api.trello.com/1/members/me/boards")
		.then()
		.statusCode(200)
		.body("id[0]", equalTo("651385787251a11f9daabbc8"))
		.body("name", hasItems("Cohort15 - LoneWolf", "Create a Board Test"));
		
		System.out.println("pass");
		
		
//		find max list and cards you can create on trello
		
		
		
		
		
		
		
		
	}

}
