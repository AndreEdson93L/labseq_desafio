package org.acme.controllers;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Unit test for the endpoint LabSeqCalculator
 */
public class LabSeqControllerTest {


    /**
     * @get GET request is made to /lab-seq with a valid inputN
     * @return status code should be 200 (Ok)
     * @return response body contained the expected LabSeq Value

     * @Important! If the service is not running, the test will fail.
     */
    @Test
    public void testLabSeqControllerForValidInput(){
        // Data to test the endpoint
        int expectedValue = 24815508;
        int inputN = 90;

        given()
                .when().get("/lab-seq?n=" + inputN)
                .then()
                .statusCode(200)
                .body(equalTo(String.valueOf(expectedValue)));
    }
}
