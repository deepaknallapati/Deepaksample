

package RestAssured.RestAssured;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Third {
	
	@Test
	public void test3()
	{
		 Response res = given().param("source", "hp&ei=mUV0W_WAOYz8vASLz4r4Dg&q=selenium").param("q","selenium&oq=selenium&gs_l=psy-ab.3..35i39k1l2j0l3j0i67k1j0l4.1086.2866.0.3759.9.8.0.0.0.0.204.975.0j6j1.7.0....0...1c.1.64.psy-ab..2.7.974.0..0i131k1.0.WtIqLFV8lPw").
				get("https://www.google.com/search");
		 
		String allheadersinfo =  res.getHeader("Content-Type");
	
		 Headers allheaders = res.getHeaders();
		 
		 List<Header> allheadersinfo1 = allheaders.asList();
		 
		 System.out.println(allheadersinfo);
		 System.out.println(allheadersinfo1);
	}

}
