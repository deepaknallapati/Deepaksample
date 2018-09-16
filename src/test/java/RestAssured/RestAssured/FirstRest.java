package RestAssured.RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class FirstRest {

	@Test
	public void statuscode() {
		String statuscode = RestAssured.given().get(
				"https://www.google.com/")
				.body().asString();
		
		

		System.out.println("The status code is" + statuscode);
		Assert.assertEquals(statuscode, 200);
	}
}
