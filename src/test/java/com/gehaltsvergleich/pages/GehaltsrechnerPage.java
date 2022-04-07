package com.gehaltsvergleich.pages;
import com.gehaltsvergleich.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GehaltsrechnerPage {

    public GehaltsrechnerPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//title[@itemprop='name']")
    public WebElement gehaltsrechnerTitle;

    @FindBy(xpath = "//input[@tabindex='1']")
    public WebElement bruttolohnIndex;

    @FindBy(css = "input[tabindex='2']")
    public WebElement jahresfreibeitragIndex;

    @FindBy(css = "input[tabindex='3']")
    public WebElement berufbezeichnung;


    @FindBy(css = "select[tabindex='4']")
    public WebElement jahrIndex;


    @FindBy(xpath = "//label[@for='yearly']")
    public WebElement zeitraumMonat;


    @FindBy(xpath = "//label[@for='monthly']")
    public WebElement zeitraumJahr;

    @FindBy(xpath = "(//input[@tabindex='5'])[2]")
    public WebElement geburtsJahr;

    @FindBy(xpath = "//select[@tabindex='6']")
    public WebElement steuerklasse;

    @FindBy(xpath = "//input[@tabindex='7']")
    public WebElement faktor;

    @FindBy(xpath = "//label[@for='rv_ost']")
    public WebElement rentenversicherungJaOst;

    @FindBy(xpath = "//label[@for='rv_west']")
    public WebElement rentenversicherungJaWest;

    @FindBy(xpath = "//label[@for='rv_no']")
    public WebElement rentenversicherungNein;

    @FindBy(xpath = "//label[@for='church_true']")
    public WebElement kirchensteuerJa;

    @FindBy(xpath = "//label[@for='church_false']")
    public WebElement kirchensteuerNein;

    @FindBy(xpath = "//input[@tabindex='10']")
    public WebElement wohnort;

    @FindBy(xpath = "//select[@tabindex='11']")
    public WebElement bundesland;

    @FindBy(xpath = "//select[@tabindex='12']")
    public WebElement krankenkasse;

    @FindBy(css = " #inputKksatz")
    public WebElement kassensatz;

    @FindBy(xpath = "//label[@for='child_true']")
    public WebElement kinderJa;

    @FindBy(xpath = "//label[@for='child_false']")
    public WebElement kinderNein;

    @FindBy(css = "#gender")
    public WebElement kinderfreibetrag;

    @FindBy(css = "#calc")
    public WebElement jetzBerechnenBtn;

    @FindBy(xpath = "//div[@id='wenn_alternating_colors']")
    public WebElement Ihrergebnis;


}
