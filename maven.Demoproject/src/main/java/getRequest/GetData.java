package getRequest;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import static io.restassured.RestAssured.given;

public class GetData {
	
	public void GetStatus()
	{

		Response resp = given().
				param("q", "Sydney,au").
				param("appid", "1074d2e62f2c60faa0b14d9e21be4dda").
				when().
				get("http://api.openweathermap.org/data/2.5/weather");
		int code =resp.statusCode();
		Assert.assertEquals(200, code);
		
		String json = resp.asString();
		System.out.println(json);
	
		
		
	}
	
	public void GetCity()
	{
		String temp = given().
				param("q", "Sydney,au").
				param("appid", "1074d2e62f2c60faa0b14d9e21be4dda").
				when().
				get("http://api.openweathermap.org/data/2.5/weather").
				then().
				contentType(ContentType.JSON).
				extract().
				path("name");
		Assert.assertEquals("Sydney", temp);
		System.out.println("name of city: " + temp);
	}
	

}
  