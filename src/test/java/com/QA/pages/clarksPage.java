package com.QA.pages;

import com.QA.opendriver;
import org.openqa.selenium.By;

public class clarksPage extends opendriver {

    public void clickSale(){
        driver.findElement(By.xpath(".//*[@id='navbar-item-5']/div[1]/a")).click();
    }




}
