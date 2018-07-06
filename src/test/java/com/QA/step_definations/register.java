package com.QA.step_definations;

import com.QA.opendriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class register extends opendriver {

//    ChromeDriver driver;

    @Given("^I enter url \"([^\"]*)\"$")
    public void iEnterUrl(String url) throws Throwable {

//        1:Open a chrome driver

//        ChromeDriverManager.getInstance().setup();
//        driver = new ChromeDriver();

        //        2:Open url
        driver.get(url);

    }


    @When("^I press Register now button$")
    public void iPressRegisterNowButton() throws Throwable {
        driver.findElement(By.id("btnRegister")).click();
//        driver.quit();

    }

    @Given("^I enter a valid email id as \"([^\"]*)\"$")
    public void iEnterAValidEmailIdAs(String emailid) throws Throwable {

        driver.findElement(By.id("EmailAddress")).sendKeys(emailid);
    }

    @Given("^I enter confirm a valid email id as \"([^\"]*)\"$")
    public void iEnterConfirmAValidEmailIdAs(String confirmemail) throws Throwable {

        driver.findElement(By.id("EmailAddressCheck")).sendKeys(confirmemail);


    }

    @Given("^I enter a valid password with no specail characters as \"([^\"]*)\"$")
    public void iEnterAValidPasswordWithNoSpecailCharactersAs(String password) throws Throwable {

        driver.findElement(By.name("Password")).sendKeys(password);

    }

    @Given("^I enter confirm a valid password characters with no specail characters as \"([^\"]*)\"$")
    public void iEnterConfirmAValidPasswordCharactersWithNoSpecailCharactersAs(String confirmpassword) throws Throwable {

        driver.findElement(By.name("PasswordCheck")).sendKeys(confirmpassword);

    }

    @Given("^I enter title as \"([^\"]*)\"$")
    public void i_enter_title_as(String titletype) throws Throwable {
        driver.findElement(By.id("TitleTypeCode")).sendKeys(titletype);
    }

    @Given("^I enter first name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String firstname) throws Throwable {
        driver.findElement(By.id("FirstName")).sendKeys(firstname);
    }


    @Given("^I enter surname as \"([^\"]*)\"$")
    public void iEnterSurnameAs(String surname) throws Throwable {
        driver.findElement(By.id("LastName")).sendKeys(surname);
    }

    @Given("^I enter address as \"([^\"]*)\"$")
    public void iEnterAddressAs(String address1) throws Throwable {

    }

    @Given("^I enter address continue as \"([^\"]*)\"$")
    public void iEnterAddressContinueAs(String address2) throws Throwable {

        driver.findElement(By.id("Address2")).sendKeys(address2);

    }


    @Given("^I enter town/city as \"([^\"]*)\"$")
    public void iEnterTownCityAs(String city) throws Throwable {

        driver.findElement(By.id("City")).sendKeys(city);
    }


    @Given("^I enter postcode/zip as \"([^\"]*)\"$")
    public void iEnterPostcodeZipAs(String postcode) throws Throwable {

        driver.findElement(By.id("PostalCode")).sendKeys(postcode);
    }

    @Given("^I enter country from dropdown menu as \"([^\"]*)\"$")
    public void iEnterCountryFromDropdownMenuAs(String country) throws Throwable {

        new Select(driver.findElement(By.id("Country"))).selectByValue(country.toUpperCase());

    }

    @Given("^I enter mobile telephone code as \"([^\"]*)\"$")
    public void iEnterMobileTelephoneCodeAs(String countrycode) throws Throwable {

        new Select(driver.findElement(By.id("CountryMobileCodes"))).selectByValue(countrycode);
    }

    @Given("^I enter mobile number as \"([^\"]*)\"$")
    public void iEnterMobileNumberAs(String mobilenumber) throws Throwable {

        driver.findElement(By.id("MobilePhone")).sendKeys(mobilenumber);
    }

    @Given("^I enter Yes, i do wish to receive updates as \"([^\"]*)\"$")
    public void iEnterYesIDoWishToReceiveUpdatesAs(String checkbox) throws Throwable {

        driver.findElement(By.id("OptInForEasyJetMailings")).click();


    }

    @Given("^i enter email id as \"([^\"]*)\"$")
    public void iEnterEmailIdAs(String emailid) throws Throwable {

        driver.findElement(By.id("EmailAddress"
        )).sendKeys(emailid);
    }

    @Given("^i enter confirm email id as \"([^\"]*)\"$")
    public void iEnterConfirmEmailIdAs(String confirmemailid) throws Throwable {

        driver.findElement(By.id("EmailAddressCheck"
        )).sendKeys(confirmemailid);
    }

    @Given("^i enter a password as \"([^\"]*)\"$")
    public void iEnterAPasswordAs(String password) throws Throwable {
        driver.findElement(By.id("Password")).sendKeys(password);

    }

    @Given("^i enter a confirm password as \"([^\"]*)\"$")
    public void iEnterAConfirmPasswordAs(String confirmpassword) throws Throwable {

        driver.findElement(By.id("PasswordCheck")).sendKeys(confirmpassword);

    }

    @Given("^i enter last name as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String lastname) throws Throwable {

        driver.findElement(By.id("LastName")).sendKeys(lastname);
    }

    @Given("^i enter mobile telephone as \"([^\"]*)\"$")
    public void iEnterMobileTelephoneAs(String telephonecode) throws Throwable {

        driver.findElement(By.id("Country")).sendKeys(telephonecode);
    }

    @Then("^I should get error message \"([^\"]*)\"$")
    public void iShouldGetErrorMessage(String expectederror) throws Throwable {

        String actualerror = null;
        if (expectederror.equals("The email addresses entered do not match")) {
            actualerror = driver.findElement(By.xpath(".//*[@id='RegistrationMiddlePanel']/div[2]/div/div[2]/label[2]")).getText();
//            assertEquals(expectederror, actualerror);
        }
        else if (expectederror.equals("Please enter the contact's city")) {

            actualerror = driver.findElement(By.xpath(".//*[@id='MemberPersonalInfoPanel']/div[2]/label[2]")).getText();
//            assertEquals(expectederror, actualerror);
        }
        else if (expectederror.equals("The email addresses entered do not match |")) {

            actualerror = driver.findElement(By.xpath(".//*[@id='RegistrationMiddlePanel']/div[2]/div/div[2]/label[2]")).getText();
//            assertEquals(expectederror, actualerror);
        }


        assertEquals(expectederror, actualerror);



    }


}
