package com.QA.step_definations;

import com.QA.opendriver;
import com.QA.pages.clarksPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class d3dregister extends opendriver {

    @When("^I click register button$")
    public void iClickRegisterButton() throws Throwable {
        driver.findElement(By.name("btn-submit")).click();

    }

    @Given("^I enter first name as \"([^\"]*)\" in d(\\d+)d security site$")
    public void iEnterFirstNameAsInDDSecuritySite(String firstname, int arg1) throws Throwable {

        driver.findElement(By.name("first_name")).sendKeys(firstname);
    }

    @Given("^I enter last name as \"([^\"]*)\" in d(\\d+)d security site$")
    public void iEnterLastNameAsInDDSecuritySite(String lastname, int arg1) throws Throwable {

        driver.findElement(By.name("last_name")).sendKeys(lastname);
    }

    @Given("^I enter a valid email id as \"([^\"]*)\" in d(\\d+)d security site$")
    public void iEnterAValidEmailIdAsInDDSecuritySite(String emailid, int arg1) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(emailid);

    }

    @Given("^I enter a password as \"([^\"]*)\" in d(\\d+)d security site$")
    public void iEnterAPasswordAsInDDSecuritySite(String password, int arg1) throws Throwable {

        driver.findElement(By.name("pass1")).sendKeys(password);
    }

    @Given("^I enter a confirm password as \"([^\"]*)\" in d(\\d+)d security site$")
    public void iEnterAConfirmPasswordAsInDDSecuritySite(String confirmpassword, int arg1) throws Throwable {

        driver.findElement(By.name("pass2")).sendKeys(confirmpassword);
    }

    @When("^I click register button in d(\\d+)d security site$")
    public void iClickRegisterButtonInDDSecuritySite(int arg0) throws Throwable {

        driver.findElement(By.name("btn-submit")).click();

    }

    @Given("^I enter url as \"([^\"]*)\"$")
    public void iEnterUrlAs(String url) throws Throwable {

        driver.get(url);
    }

}
