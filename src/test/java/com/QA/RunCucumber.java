package com.QA;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",strict = true,  tags = {"@d3d_register"},plugin = {"json:target/cucmber.json"})

public class RunCucumber {


}
