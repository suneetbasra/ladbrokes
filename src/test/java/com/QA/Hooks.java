package com.QA;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    opendriver odriver = new opendriver();

    @Before
    public void beforebowser() {
        odriver.openbrowser();
        System.out.println("BEFORE    BEFORE");
    }

    @After
    public void closebrowser() {
        odriver.closebrowser();
        System.out.println("after AFTER AFTER");
    }
}
