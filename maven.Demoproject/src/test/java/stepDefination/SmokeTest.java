package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import getRequest.GetData;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;

public class SmokeTest {
	
	String url;
	Response response;
	GetData data = new GetData();
	
	@Given("^I like to holiday in Sydney$")
	public void i_like_to_holiday_in_Sydney() throws Throwable {

		data.GetStatus();
		data.GetCity();

	}

	@Given("^I only like to holiday on Thursdays$")
	public void i_only_like_to_holiday_on_Thursdays() throws Throwable {

	}

	@When("^I look up the weather forecast$")
	public void i_look_up_the_weather_forecast() throws Throwable {

	}

	@Then("^I receive the weather forecast$")
	public void i_receive_the_weather_forecast() throws Throwable {

	}

	@Then("^the temperature is warmer than (\\d+) degrees$")
	public void the_temperature_is_warmer_than_degrees(int arg1) throws Throwable {

	}

}
