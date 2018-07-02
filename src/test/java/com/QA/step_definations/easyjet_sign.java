package com.QA.step_definations;

import com.QA.opendriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class easyjet_sign extends opendriver {
    @When("^I click signing button$")
    public void iClickSigningButton() throws Throwable {
//        driver.findElement(By.xpath("//*[@id='pageWrapper']/header/div[1]/div[1]/nav[2]/ul/li[2]/span/a[2]/span[1]")).click();
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(5000);


    }


    @Given("^I enter username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String username) throws Throwable {
        driver.findElement(By.id("signin-username")).sendKeys(username);

    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) throws Throwable {

        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("^I click signin button$")
    public void iClickSigninButton() throws Throwable {
        driver.findElement(By.id("signin-login")).click();
        Thread.sleep(5000);
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String expectedmybooking) throws Throwable {
        String actualmybooking;
        actualmybooking = driver.findElement(By.id("mainHeading")).getText();
        assertEquals(expectedmybooking, actualmybooking);
    }

    @Then("^I should get an error message as \"([^\"]*)\"$")
    public void iShouldGetAnErrorMessageAs(String errormessage) throws Throwable {
        Thread.sleep(3000);
//        String actualerrormessage = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/form/div[7]/span")).getText();
        String actualerrormessage = driver.findElement(By.xpath(".//*[@id='wpcf7-f391-o1']/form/div[8]")).getText();

//        String actualerrormessage = driver.findElement(By.cssSelector(".incorrectemail-errormessage")).getText();
        assertEquals(errormessage, actualerrormessage);

    }
}
