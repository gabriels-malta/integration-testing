package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import definition.ProcessAPI;
import support.RESTSupport;

public class CreateSteps {

    @Given("^User already in new process page$")
    public void userAlreadyInNewProcessPage() {
        ProcessAPI.clearFields();
    }

    @And("^User fill field (.*) with value \"([^\"]*)\"$")
    public void userFillFieldWithValue(String field, String value) throws Throwable {
        ProcessAPI.addFields(field, value);
    }

    @And("^User click on save button$")
    public void userClickOnSaveButton() {
        RESTSupport.executePost(ProcessAPI.getEndpoint(), ProcessAPI.getFields());
        ProcessAPI.storeProcessId(RESTSupport.key("id").toString());
    }
}
