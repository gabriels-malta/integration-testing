package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import definition.ReqRes;
import org.junit.Assert;
import support.RESTSupport;


public class PostUsersSteps {
    @And("^User post on list all button$")
    public void userPostOnListAllButton() {
        RESTSupport.executeGet(ReqRes.getEndpoint());
    }

    @Then("^User should post status code (\\d+)$")
    public void userShouldPostStatusCode(int statusCode) {
        int response = RESTSupport.getResponseCode();
        Assert.assertEquals(statusCode, response);
    }


    @When("^User enter post id as \"([^\"]*)\"$")
    public void userEnterPostIdAs(String userId) throws Throwable {
        ReqRes.storeUserId(userId);
    }

    @And("^User click on postUser button$")
    public void userClickOnPostUserButton() {
        String url = ReqRes.getEndpoint() + "/" + ReqRes.getUserId();
        String jsonPost = "{'id':1,'email':'george.bluth@reqres.in','first_name':'George','last_name':'Bluth','avatar':'https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg'}";
        ReqRes.addFields("id", "1");
        ReqRes.addFields("email", "george.bluth@reqres.in");
        ReqRes.addFields("first_name", "George");
        ReqRes.addFields("last_name", "Bluth");
        ReqRes.addFields("avatar", "https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg");
        RESTSupport.executePost(url, ReqRes.getFields());

    }

    @Given("^User post for a single register$")
    public void userPostForASingleRegister() {
        ReqRes.storeUserId("");
    }
}
