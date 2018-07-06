package com.QA.step_definations;

import com.QA.opendriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class d3dquote extends opendriver {

    @Given("^I enter first name as \"([^\"]*)\" in security site$")
    public void IEnterFirstNameAsInSecuritySite(String firstname) throws Throwable {

        driver.findElement(By.name("first_name")).sendKeys(firstname);

    }

    @Given("^I enter last name as \"([^\"]*)\" in security site$")
    public void iEnterLastNameAsInSecuritySite(String lastname) throws Throwable {

        driver.findElement(By.name("last_name")).sendKeys(lastname);
    }

    @Given("^I enter email id as \"([^\"]*)\" in security site$")
    public void iEnterEmailIdAsInSecuritySite(String emailid) throws Throwable {

        driver.findElement(By.name("your-email")).sendKeys(emailid);
    }

    @Given("^I enter phone number as \"([^\"]*)\" in security site$")
    public void iEnterPhoneNumberAsInSecuritySite(String phonenumber) throws Throwable {

        driver.findElement(By.name("tel-879")).sendKeys(phonenumber);
    }

    @Given("^I enter subject as \"([^\"]*)\" in security site$")
    public void iEnterSubjectAsInSecuritySite(String subject) throws Throwable {
        driver.findElement(By.name("your-subject")).sendKeys(subject);
    }

    @Given("^I enter message as \"([^\"]*)\" in security site$")
    public void iEnterMessageAsInSecuritySite(String message) throws Throwable {

        driver.findElement(By.name("your-message")).sendKeys(message);
    }

    @Given("^I enter captcha code as \"([^\"]*)\" in seciruty site$")
    public void iEnterCaptchaCodeAsInSecirutySite(String captcha) throws Throwable {
        driver.findElement(By.name("captcha-005")).sendKeys(captcha);
    }

    @When("^I click send message button$")
    public void iClickSendMessageButton() throws Throwable {

        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-o1']/form/p[3]/span/span")).click();
        Thread.sleep(3000);

    }

    @Then("^I should get an error message as \"([^\"]*)\" in security site$")
    public void iShouldGetAnErrorMessageAsInSecuritySite(String errormessage) throws Throwable {

        String actualerror;


        Thread.sleep(5000);
        actualerror = driver.findElement(By.xpath(".//*[@id='wpcf7-f391-o1']/form/p[3]/span/span")).getText();

        assertEquals(actualerror, errormessage);

    }

    @When("^I click send message button in security site$")
    public void iClickSendMessageButtonInSecuritySite() throws Throwable {

        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-o1']/form/p[4]/input")).click();

    }
}
