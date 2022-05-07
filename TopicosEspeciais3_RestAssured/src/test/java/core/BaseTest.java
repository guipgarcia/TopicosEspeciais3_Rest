package core;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.testng.annotations.BeforeClass;

public class BaseTest implements Constants{

    @BeforeClass
    public void before() {
        // Setting baseURI
        RestAssured.baseURI = BASEURL;

        // Setting JSON
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setContentType(APP_CONTENT_TYPE);
        RestAssured.requestSpecification = requestSpecBuilder.build();

        // If fails, shows application log
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
