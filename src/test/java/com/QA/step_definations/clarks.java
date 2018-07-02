package com.QA.step_definations;

import com.QA.opendriver;
import com.QA.pages.clarksPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertEquals;

public class clarks extends opendriver {

    public clarksPage clarks_page = PageFactory.initElements(driver, clarksPage.class);


    @Given("^I click sale$")
    public void iClickSale() throws Throwable {
        clarks_page.clickSale();

        //driver.findElement(By.xpath(".//*[@id='navbar-item-5']/div[1]/a")).click();
    }

    @Given("^I click shop mens$")
    public void iClickShopMens() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='ss-sc-des-mens']")).click();
        Thread.sleep(3000);
    }

    @When("^I click size (\\d+)$")
    public void iClickSize(int arg0) throws Throwable {

        driver.findElement(By.xpath(".//*[@id='page']/div[2]/div[1]/div/div/div[1]/div/a[2]")).click();
        Thread.sleep(3000);
    }

    @When("^I click colour$")
    public void iClickColour() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='page']/div[2]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div/a/span[1]")).click();
        Thread.sleep(2000);
    }

    @When("^I click black$")
    public void iClickBlack() throws Throwable {

        driver.findElement(By.xpath(".//*[@id='Colour3Label']/span[1]")).click();
    }

    @Then("^I should see \"([^\"]*)\" on clarks website$")
    public void iShouldSeeOnClarksWebsite(String result) throws Throwable {

        String result_actual;

        result_actual = driver.findElement(By.xpath(".//*[@id='foundProductCount']")).getText();


        assertEquals(result, result_actual);


    }

    @When("^I click size eight$")
    public void iClickSizeEight() throws Throwable {

        driver.findElement(By.xpath(".//*[@id='page']/div[2]/div[1]/div/div/div[1]/div/a[2]")).sendKeys();
    }
}
