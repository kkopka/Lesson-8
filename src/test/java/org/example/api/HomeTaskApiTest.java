package org.example.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.example.model.Pet;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;


import static io.restassured.RestAssured.given;

public class HomeTaskApiTest {
    Pet pet1 = new Pet();
    private int id = new Random().nextInt(500000);
    private int petId = new Random().nextInt(500000);

    @BeforeClass
    public void prepare() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my.properties"));
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/")
                .addHeader("api_key", System.getProperty("api.key"))
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
    }

    @Test
    public void request() {
        pet1.setId(id);
        pet1.setPetId(petId);
        pet1.setQuantity(new Random().nextInt(5));

        given()
                .body(pet1)
                .when()
                .post("/store/order")
                .then()
                .statusCode(200);


        Pet actual =
                given()
                        .pathParam("orderId", id)
                        .when()
                        .get("/store/order/{orderId}")
                        .then()
                        .statusCode(200)
                        .extract().body()
                        .as(Pet.class);

        Assert.assertEquals(actual.getId(), pet1.getId());
    }

    @Test
    public void tetDelete() throws IOException {
        given()
                .pathParam("orderId", pet1.getId())
                .when()
                .delete("/store/order/{orderId}")
                .then()
                .statusCode(200);
        given()
                .pathParam("orderId", pet1.getId())
                .when()
                .get("/store/order/{orderId}")
                .then()
                .statusCode(404);
    }

}
