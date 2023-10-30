package alg.newFieldInDto;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import alg.newFieldInDto.dto.RegistrationRequestDto;

import static io.restassured.RestAssured.given;
import static io.restassured.filter.log.LogDetail.BODY;

public class RegistrationApi {

    public ValidatableResponse registerUser(RegistrationRequestDto requestDto) {
        return given()
                .baseUri("https://www.petflow.com")
                .when()
                .post("/register")
                .then();
    }

    protected final RequestSpecification baseRequestSpec = new RequestSpecBuilder()
            .setBaseUri("https://www.petflow.com")
            .setContentType(ContentType.URLENC)  // Set the content type to URL encoding
            // ... (other configuration)
            .build()
            .log().ifValidationFails()
            .log().uri()
            .log().body();

    protected final ResponseSpecification baseResponseSpec = new ResponseSpecBuilder()
            .log(BODY)
            .build();
}
