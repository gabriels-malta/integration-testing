package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import definition.ProcessAPI;
import org.junit.Assert;
import support.RESTSupport;

public class GeneralSteps {

    @And("^User click on list all process button$")
    public void userClickOnListAllButton() {
        RESTSupport.executeGet(ProcessAPI.getEndpoint());
    }

    @Then("^User should see status code (\\d+)$")
    public void userShouldSeeStatusCode(int statusCode) {
        int response = RESTSupport.getResponseCode();

        Assert.assertEquals(statusCode, response);
    }
}
