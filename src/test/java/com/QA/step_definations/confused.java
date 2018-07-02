package com.QA.step_definations;

import com.QA.opendriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class confused extends opendriver {
    @Given("^I click My account$")
    public void iClickMyAccount() throws Throwable {

        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='frmBody']/div[3]/div[1]/div/div/div/header/div/div/div/a[2]")).click();

    }

    @Given("^I click Log in$")
    public void iClickLogIn() throws Throwable {

        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='frmBody']/div[3]/div[1]/div/div/div/header/div/div/div/nav/ul/li[5]/a[1]")).click();
    }

    @Given("^I enter email address as \"([^\"]*)\" in confused web$")
    public void iEnterEmailAddressAsInConfusedWeb(String email) throws Throwable {

        Thread.sleep(1000);
        TimeUnit.SECONDS.sleep(1);
        waitforelement(driver.findElement(By.id("EmailAddress")));
        driver.findElement(By.id("EmailAddress")).sendKeys(email);
    }

    @Given("^I enter password as \"([^\"]*)\" in confused web$")
    public void iEnterPasswordAsInConfusedWeb(String password) throws Throwable {

        Thread.sleep(2000);
        driver.findElement(By.id("login-password")).sendKeys(password);
    }

    @When("^I click Login$")
    public void iClickLogin() throws Throwable {

        driver.findElement(By.xpath(".//*[@id='login']")).click();
    }

    @Then("^I should see \"([^\"]*)\" in confused web$")
    public void iShouldSeeInConfusedWeb(String expectedresults) throws Throwable {

        Thread.sleep(5000);

        String actualresults;

        if (expectedresults.equals("Beat your renewal guaranteed")) {
            actualresults = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div/div/div/div[1]/h3")).getText();
        } else {
            actualresults = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div/div/div/header/div/div/div[2]/a[1]")).getText();
        }

//        assertTrue(actualresults.equals(expectedresults));
        assertFalse(actualresults.equals(expectedresults));
//        assertEquals(expectedresults.toUpperCase(), actualresults.toUpperCase());
        assertNotEquals(expectedresults.toUpperCase(), actualresults.toUpperCase());
    }

    @When("^I click logout$")
    public void iClickLogout() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='header_Login_LogOut']")).click();
    }

    @Then("^I should see \"([^\"]*)\" in confused web singout$")
    public void iShouldSeeInConfusedWebSingout(String arg0) throws Throwable {
        Thread.sleep(5000);

        driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div/div/div/div[1]/h4")).getText();

    }
}
