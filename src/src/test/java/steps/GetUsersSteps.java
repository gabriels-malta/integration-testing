package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import definition.ReqRes;
import org.junit.Assert;
import support.RESTSupport;

public class GetUsersSteps {
    @And("^User click on list all button$")
    public void userClickOnListAllButton() {
        RESTSupport.executeGet(ReqRes.getEndpoint());
    }

    @Then("^User should see status code (\\d+)$")
    public void userShouldSeeStatusCode(int statusCode) {
        int response = RESTSupport.getResponseCode();

        Assert.assertEquals(statusCode, response);
    }

    @When("^User enter id as \"([^\"]*)\"$")
    public void userEnterIdAs(String userId) throws Throwable {
        ReqRes.storeUserId(userId);
    }

    @And("^User click on getUser button$")
    public void userClickOnGetUserButton() {
        String url = ReqRes.getEndpoint() + "/" + ReqRes.getUserId();
        RESTSupport.executeGet(url);
    }

    @Given("^User look for a single register$")
    public void userLookForASingleRegister() {
        ReqRes.storeUserId("");
    }
}
