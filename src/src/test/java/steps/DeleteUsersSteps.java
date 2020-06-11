package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import definition.ReqRes;
import org.junit.Assert;
import support.RESTSupport;

public class DeleteUsersSteps {
    @And("^User Delete User")
    public void userDeleteUser() {
        RESTSupport.executeDelete(ReqRes.getEndpoint());
    }

    @Then("^User should delete status code (\\d+)$")
    public void userShouldDeleteStatusCode(int statusCode) {
        int response = RESTSupport.getResponseCode();

        Assert.assertEquals(statusCode, response);
    }

    @When("^User enter delete id as \"([^\"]*)\"$")
    public void userEnterDeleteIdAs(String userId) throws Throwable {
        ReqRes.storeUserId(userId);
    }

    @And("^User click on deleteUser button$")
    public void userClickOnDeleteUserButton() {
        String url = ReqRes.getEndpoint() + "/" + ReqRes.getUserId();
        RESTSupport.executeDelete(url);
    }

    @Given("^User delete for a single register$")
    public void userDeleteForASingleRegister() {
        ReqRes.storeUserId("");
    }
}
