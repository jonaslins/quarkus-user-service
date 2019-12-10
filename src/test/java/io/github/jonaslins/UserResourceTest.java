package io.github.jonaslins;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;

@QuarkusTest
public class UserResourceTest {

    @Test
    public void testlistAll() {
        given()
          .when().get("/user")
          .then()
             .statusCode(200)
             .body("$", hasSize(greaterThan(0)));
    }

}