package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
public class BreedsSteps {

    Response response;

    public BreedsSteps(){
        baseURI = "https://dog.ceo/api/";
    }

    @When("I make request image count for {string}")
    public void ı_make_request_image_count_for(String breedsName) {
        //https://dog.ceo/api/breed/appenzeller/images
        response = given()
                .accept(ContentType.JSON)
                .when()
                .get("breed/"+breedsName+"/images")
                .then()
                .statusCode(200)
                .extract().response();
    }

    @Then("I verify count to {int}")
    public void ı_verify_count_to(int imagesCount) {


        List breedList =response.getBody().jsonPath().get("message");
        int actualCount = breedList.size();
     // Assert.assertTrue(actualCount == imagesCount);
        Assert.assertEquals(imagesCount,actualCount);

    }

}
