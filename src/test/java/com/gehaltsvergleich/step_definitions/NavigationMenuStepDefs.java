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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NavigationMenuStepDefs {

    @Given("the user is on the start page")
    public void the_user_is_on_the_start_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        BrowserUtils.waitFor(2);
        new BasePage().Alles_akzeptieren.click();
        BrowserUtils.waitFor(2);


    }


    @Then("the title should be Gehalt nach Beruf, Branche & Bundesland")
    public void the_title_should_be_Gehalt_nach_Beruf_Branche_Bundesland() {

        String expectedTitle = "Gehalt nach Beruf, Branche & Bundesland | Gehaltsvergleich.com";
        String actualTitle = Driver.get().getTitle();


        Assert.assertEquals("does not match", actualTitle, expectedTitle);


    }


    @Then("the title should be Gehaltscheck: Verdienen Sie genug? Jetzt vergleichen!")
    public void the_title_should_be_Gehaltscheck_Verdienen_Sie_genug_Jetzt_vergleichen() {
        String expectedTitle = "Gehaltscheck: Verdienen Sie genug? Jetzt vergleichen!";
        String actualTitle = Driver.get().getTitle();


        Assert.assertEquals("does not match", actualTitle, expectedTitle);

    }


    @Then("the title should be Ihr Brutto-Netto-Rechner {int} von Gehaltsvergleich.com")
    public void the_title_should_be_Ihr_Brutto_Netto_Rechner_von_Gehaltsvergleich_com(Integer int1) {
        String expectedTitle = "Ihr Brutto-Netto-Rechner 2022 von Gehaltsvergleich.com";
        String actualTitle = Driver.get().getTitle();


        Assert.assertEquals("does not match", actualTitle, expectedTitle);

    }


    @Then("the title should be Jobs und Stellenangebote auf Gehaltsvergleich.com")
    public void the_title_should_be_Jobs_und_Stellenangebote_auf_Gehaltsvergleich_com() {
        String expectedTitle = "Jobs und Stellenangebote auf Gehaltsvergleich.com";
        String actualTitle = Driver.get().getTitle();


        Assert.assertEquals("does not match", actualTitle, expectedTitle);
    }


    @Then("the title should be Karrierelexikon & Dokumentvorlagen | Gehaltsvergleich.com")
    public void the_title_should_be_Karrierelexikon_Dokumentvorlagen_Gehaltsvergleich_com() {
        String expectedTitle = "Karrierelexikon & Dokumentvorlagen | Gehaltsvergleich.com";
        String actualTitle = Driver.get().getTitle();


        Assert.assertEquals("does not match", actualTitle, expectedTitle);
    }


    @Then("the title should be Aktuelle News zu Gehalt, Beruf & Karriere | Gehaltsvergleich.com")
    public void the_title_should_be_Aktuelle_News_zu_Gehalt_Beruf_Karriere_Gehaltsvergleich_com() {
        String expectedTitle = "Aktuelle News zu Gehalt, Beruf & Karriere | Gehaltsvergleich.com";
        String actualTitle = Driver.get().getTitle();


        Assert.assertEquals("does not match", actualTitle, expectedTitle);
    }


    @When("the user navigates to {string}")
    public void the_user_navigates_to(String tab) {
        new BasePage().navigateToModule(tab);
    }

}
