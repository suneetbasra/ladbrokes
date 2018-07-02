package com.QA.step_definations;

import com.QA.opendriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class moneysuper extends opendriver {
    @Given("^I click login  button in moneyweb$")
    public void iClickLoginButtonInMoneyweb() throws Throwable {

        Thread.sleep(6000);
        driver.findElement(By.xpath("html/body/div[3]/header/nav/ul/li[3]/button")).click();

    }

    @Given("^I enter a valid email id as \"([^\"]*)\" in moneyweb$")
    public void iEnterAValidEmailIdAsInMoneyweb(String email) throws Throwable {

        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='signInForm']/div/span[2]/span/span/input")).sendKeys(email);
    }

    @Given("^I enter a valid password as \"([^\"]*)\" in moneyweb$")
    public void iEnterAValidPasswordAsInMoneyweb(String password) throws Throwable {

        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='signInForm']/div/div[2]/div/div[1]/input")).sendKeys(password);
    }

    @Given("^I untick Remember me for (\\d+) days in moneyweb$")
    public void iUntickRememberMeForDaysInMoneyweb(int arg0) throws Throwable {

        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='signInForm']/div/div[3]/div/label")).click();

    }

    @When("^I click signing button in moneyweb$")
    public void iClickSigningButtonInMoneyweb() throws Throwable {

        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='signInForm']/div/div[4]/button")).click();

    }

    @Then("^I should see \"([^\"]*)\" in moneyweb$")
    public void iShouldSeeInMoneyweb(String welcome) throws Throwable {

        Thread.sleep(3000);


    }

    @Then("^I should get an error message as \"([^\"]*)\" in moneyweb$")
    public void iShouldGetAnErrorMessageAsInMoneyweb(String error) throws Throwable {

        Thread.sleep(5000);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(".//*[@id='signInForm']/div/div[2]/div/div[5]/div")).getText();
        driver.findElement(By.xpath(".//*[@id='signInForm']/div/span[2]/span/span/div[5]/div")).getText();
//        github sample
    }
}
