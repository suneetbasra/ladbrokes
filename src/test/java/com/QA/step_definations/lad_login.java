package com.QA.step_definations;

import com.QA.opendriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class lad_login extends opendriver {
    @Given("^I enter username as \"([^\"]*)\" in ladbrokes$")
    public void iEnterUsernameAsInLadbrokes(String user) throws Throwable {

        driver.findElement(By.id("username")).sendKeys(user);

    }

    @Given("^i enter a password as \"([^\"]*)\" in ladbrokes$")
    public void iEnterAPasswordAsInLadbrokes(String pass) throws Throwable {

        driver.findElement(By.id("password")).sendKeys(pass);
    }

    @When("^I click login in ladborkes$")
    public void iClickLoginInLadborkes() throws Throwable {

        driver.findElement(By.xpath(".//*[@id='loginSubmit']/div[3]/button[1]")).click();
    }

    @Then("^I should see \"([^\"]*)\" in ladbrokes$")
    public void iShouldSeeInLadbrokes(String login_message) throws Throwable {

        String actual_messageloging;

        actual_messageloging = driver.findElement(By.xpath(".//*[@id='header']/div/div/div/div[1]/a")).getText();

        assertEquals(actual_messageloging,login_message);
    }
}
