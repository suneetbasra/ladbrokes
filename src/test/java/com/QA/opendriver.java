package com.QA;

import com.sun.javafx.runtime.SystemProperties;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class opendriver {
    public static WebDriver driver;

//    public WebDriverWait wait = new WebDriverWait(driver, 60);

    public void openbrowser() {
        String browser;
        browser = System.getProperty("browser");
        if (browser.equals("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {

            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("IE")) {

            InternetExplorerDriverManager.getInstance().setup();
            driver = new InternetExplorerDriver();
        }

        driver.manage().window().maximize();

    }

    public void closebrowser() {
//        driver.quit();
    }

    public void waitforelement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}


