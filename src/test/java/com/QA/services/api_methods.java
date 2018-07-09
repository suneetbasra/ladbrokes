package com.QA.services;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

public class api_methods {

    public Response Getrequest(String endpoint){

        return given().when().get(endpoint);
    }
}


