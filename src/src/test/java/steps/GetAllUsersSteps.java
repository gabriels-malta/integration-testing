package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import definition.ReqRes;
import org.junit.Assert;
import support.RESTSupport;

public class GetAllUsersSteps {

    @Given("^User click on search button$")
    public void userClickOnSearchButton() {
        RESTSupport.executeGet(ReqRes.getEndpoint());
    }

    @Then("^User should see status code (\\d+)$")
    public void userShouldSeeStatusCode(int statusCode) {
        int response = RESTSupport.getResponseCode();

        Assert.assertEquals(statusCode, response);
    }
}
