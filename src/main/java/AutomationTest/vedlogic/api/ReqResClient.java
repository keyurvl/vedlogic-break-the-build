package AutomationTest.vedlogic.api;

import AutomationTest.vedlogic.config.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class ReqResClient {

    public ReqResClient() {
        RestAssured.baseURI = ConfigReader.get("apiBaseUrl");
    }

    public Response getUser(int userId) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get("/api/users/" + userId)
                .then()
                .extract()
                .response();
    }

    public Response listUsers(int page) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .queryParam("page", page)
                .when()
                .get("/api/users")
                .then()
                .extract()
                .response();
    }

    public Response createUser(String name, String job) {
        Map<String, Object> requestBody = new HashMap<String, Object>();
        // Intentional bug: wrong field name for API payload.
        requestBody.put("namee", name);
        requestBody.put("job", job);

        return RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                // Intentional bug: wrong path
                .post("/api/user")
                .then()
                .extract()
                .response();
    }

    public Response deleteUser(int userId) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .delete("/api/users/" + userId)
                .then()
                .extract()
                .response();
    }
}
