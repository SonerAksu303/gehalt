package com.gehaltsvergleich.step_definitions;

import com.gehaltsvergleich.pages.BasePage;
import com.gehaltsvergleich.pages.GehälterPage;
import com.gehaltsvergleich.utilities.BrowserUtils;
import com.gehaltsvergleich.utilities.ConfigurationReader;
import com.gehaltsvergleich.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;
public class GehälterStepDefs {

    @Given("the user is on {string} Page")
    public void the_user_is_on_Page(String tab) {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        BrowserUtils.waitFor(2);
        new BasePage().Alles_akzeptieren.click();
        BrowserUtils.waitFor(2);

        new BasePage().navigateToModule(tab);
        BrowserUtils.waitFor(2);
    }


    @When("the user searches for Softwaretester in Hamburg")
    public void the_user_searchs_Softwaretester_in_Hamburg() {


        new GehälterPage().jobtitleBtn.sendKeys("Softwaretester");
        new GehälterPage().ortBtn.sendKeys("Hamburg");
        new GehälterPage().berechnenBtn.click();

        String currentWindowHandle = Driver.get().getWindowHandle();
        System.out.println(currentWindowHandle);

        Set<String> windowHandles = Driver.get().getWindowHandles();

        System.out.println("windowHandles = " + windowHandles.size());

        for (String handle : windowHandles) {
            if (!handle.equals(currentWindowHandle)) {
                Driver.get().switchTo().window(handle);
            }
        }

    }


    @When("the user searches for {string} {string}")
    public void the_user_searches_for(String string, String string2) {
        new GehälterPage().jobtitleBtn.sendKeys(string);
        new GehälterPage().ortBtn.sendKeys(string2);
        new GehälterPage().berechnenBtn.click();

        String currentWindowHandle = Driver.get().getWindowHandle();
        System.out.println(currentWindowHandle);

        Set<String> windowHandles = Driver.get().getWindowHandles();

        System.out.println("windowHandles = " + windowHandles.size());

        for (String handle : windowHandles) {
            if (!handle.equals(currentWindowHandle)) {
                Driver.get().switchTo().window(handle);
            }
        }

    }


    @Then("the min salary should be {string}")
    public void the_min_salary_should_be(String string) {
        String expSal = string;
        String actSal = new GehälterPage().gehalt.getText();
        Assert.assertEquals("not matches", actSal, expSal);
        System.out.println(expSal);
    }
}
