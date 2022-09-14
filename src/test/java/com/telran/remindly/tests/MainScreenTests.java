package com.telran.remindly.tests;

import com.telran.remindly.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase {

    @Test
    public void launchAppTest() {
        System.out.println("App opened!");
        Assert.assertTrue(app.getMainScreen().isNoReminderTextPresent());
    }

    @Test
    public void licensesCheckTest() {
        //tap on Hamburger
        app.getMainScreen().tapOnHamburger();
        //tap on Licenses
        app.getMainScreen().tapOnLicenses();
        // assert Licenses open
        Assert.assertTrue(app.getMainScreen().isTitleLicensesPresent());

    }
}
