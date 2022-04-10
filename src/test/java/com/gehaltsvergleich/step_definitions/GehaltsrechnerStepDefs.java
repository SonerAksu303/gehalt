package com.gehaltsvergleich.step_definitions;

import com.gehaltsvergleich.pages.GehaltsrechnerPage;
import com.gehaltsvergleich.utilities.BrowserUtils;
import com.sun.source.tree.IfTree;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

public class GehaltsrechnerStepDefs {


    @When("the user enters following infos {string} {string} {string} {string} {string} {string} {string} {string}  {string} {string} {string} {string} {string} {string} \"Ja\"{int} \"")
    public void the_user_enters_following_infos_Ja(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, Integer int1) {

        new GehaltsrechnerPage().bruttolohnIndex.sendKeys(string);
        new GehaltsrechnerPage().jahresfreibeitragIndex.sendKeys(string2);
        new GehaltsrechnerPage().berufbezeichnung.sendKeys(string3);
        Select select = new Select(new GehaltsrechnerPage().jahrIndex);
        select.selectByValue(string4);

        if (string5.equalsIgnoreCase("Jahr")) {
            new GehaltsrechnerPage().zeitraumJahr.click();
        } else new GehaltsrechnerPage().zeitraumMonat.click();

        new GehaltsrechnerPage().geburtsJahr.sendKeys(string6);
        Select select1 = new Select(new GehaltsrechnerPage().steuerklasse);
        select1.selectByVisibleText(string7);
        new GehaltsrechnerPage().faktor.sendKeys(string8);
        if (string9.equalsIgnoreCase("Ja (West)")) {
            new GehaltsrechnerPage().rentenversicherungJaWest.click();
        } else if (string9.equalsIgnoreCase("Ja (Ost)")) {
            new GehaltsrechnerPage().rentenversicherungJaOst.click();
        } else new GehaltsrechnerPage().rentenversicherungNein.click();

        if (string10.equalsIgnoreCase("Ja")) {
            new GehaltsrechnerPage().kirchensteuerJa.click();
        } else new GehaltsrechnerPage().kirchensteuerNein.click();

        new GehaltsrechnerPage().wohnort.sendKeys(string11.toLowerCase(Locale.ROOT));
        Select select2 = new Select(new GehaltsrechnerPage().bundesland);
        select2.selectByVisibleText(string12);
        Select select3 = new Select(new GehaltsrechnerPage().krankenkasse);
        select3.selectByVisibleText(string13);
        new GehaltsrechnerPage().kassensatz.sendKeys(string14);
        new GehaltsrechnerPage().kinderJa.click();
        Select select4 = new Select(new GehaltsrechnerPage().kinderfreibetrag);
        select4.selectByIndex(int1);
        new GehaltsrechnerPage().jetzBerechnenBtn.click();


    }


    @Then("the result should be {string}")
    public void the_result_should_be(String string) {
        System.out.println(new GehaltsrechnerPage().Ihrergebnis.getText());

        Assert.assertTrue(new GehaltsrechnerPage().Ihrergebnis.getText().contains("Netto 44.013,75 € 3.667,81 €"));

    }
}