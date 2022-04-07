package com.gehaltsvergleich.pages;

import com.gehaltsvergleich.utilities.BrowserUtils;
import com.gehaltsvergleich.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public  class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

   @FindBy(css = "#beruf2")
   public WebElement beruf;

    @FindBy(xpath = "//button[@data-submissionid='Button Jobsuche']")
    public WebElement berechnenBtn;

    @FindBy(css = "#ccmgt_explicit_accept")
    public WebElement Alles_akzeptieren;


    public void navigateToModule(String tab) {

        String tabLocator=   "//a[@data-submissionid='Link" + " " + tab + "']"; ;
        System.out.println(tabLocator);
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 10);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);

        }


    }
}