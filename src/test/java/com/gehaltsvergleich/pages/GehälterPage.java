package com.gehaltsvergleich.pages;
import com.gehaltsvergleich.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GehälterPage {

    public GehälterPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@data-submissionid='Button Jobsuche']")
    public WebElement berechnenBtn;

    @FindBy(css = "#beruf2")
    public WebElement jobtitleBtn;

    @FindBy(css ="#location")
    public WebElement ortBtn;

    @FindBy(xpath = "//span[@class='salary month']")
    public WebElement gehalt;

    @FindBy(xpath = "(//*[text() = '4.726 €'])[1]")
    public WebElement minSal_manager;



}
