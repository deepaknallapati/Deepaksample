package RestAssured.RestAssured;


import org.testng.annotations.Test;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;



public class Second {
	
	@Test 
	public void test2()
	{
		RequestSpecification req_spec = given();
		Response res = req_spec.get("https://www.google.com/");
		int code = res.statusCode();
		long restime = res.getTime();
		String resp = res.asString();
		String contenttype = res.contentType();
		String responlybody = res.body().asString();
		
		System.out.println("Statuscode is"+code);
		System.out.println("ResponceTime"+restime);
		System.out.println("Responcet Body"+resp);
		System.out.println("Response content Type "+contenttype);
		System.out.println("Reposebody Type"+responlybody);
	}
	

}
