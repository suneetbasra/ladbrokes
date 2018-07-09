package com.QA.step_definations;

import com.QA.services.api_methods;
import com.jayway.restassured.response.Response;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class premierin_API_GET extends api_methods {

    public Response res;

//
//    @Given("^I have end point \"([^\"]*)\"$")
//    public void iHaveEndPoint(String uri) throws Throwable {
//        res = Getrequest(uri);
//        System.out.println(res.getStatusCode());
//    }
//
//
//    @Then("^I should see response code as (\\d+)$")
//    public void iShouldSeeResponseCodeAs(int expectedResponseCode) throws Throwable {
//        int actualResponseCode;
//
//        actualResponseCode = res.getStatusCode();
//        assertEquals(expectedResponseCode, actualResponseCode);
//
//    }

    @Given("^I have end point \"([^\"]*)\"$")
    public void iHaveEndPoint(String uri) throws Throwable {

        res = Getrequest(uri);


    }


    @Then("^I should see response code as (\\d+)$")
    public void iShouldSeeResponseCodeAs(int responsecode) throws Throwable {

        int actualresponcecode = res.getStatusCode();

        assertEquals(responsecode,actualresponcecode);
    }
}
