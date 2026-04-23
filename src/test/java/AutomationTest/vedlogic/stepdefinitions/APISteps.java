package AutomationTest.vedlogic.stepdefinitions;

import AutomationTest.vedlogic.api.ReqResClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

public class APISteps {
    private final ReqResClient reqResClient = new ReqResClient();
    private Response response;

    @Given("the ReqRes API client is available")
    public void theReqResApiClientIsAvailable() {
        Assert.assertNotNull(reqResClient);
    }

    @When("the user fetches user with id {int}")
    public void theUserFetchesUserWithId(Integer userId) {
        response = reqResClient.getUser(userId);
    }

    @Then("the response should contain first name {string}")
    public void theResponseShouldContainFirstName(String firstName) {
        Assert.assertEquals(response.getString("data.first_name"), firstName);
    }

    @When("the user creates a new ReqRes user with name {string} and job {string}")
    public void theUserCreatesANewReqResUserWithNameAndJob(String name, String job) {
        response = reqResClient.createUser(name, job);
    }

    @Then("the created response should contain name {string}")
    public void theCreatedResponseShouldContainName(String name) {
        Assert.assertEquals(response.getString("data.name"), name);
    }
}
