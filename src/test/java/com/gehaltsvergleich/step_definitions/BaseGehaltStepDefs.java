package com.gehaltsvergleich.step_definitions;

import com.gehaltsvergleich.pages.BasePage;
import io.cucumber.java.en.When;

public class BaseGehaltStepDefs {

    @When("the user searches for {string}")
    public void the_user_searches_for(String string) {
        new BasePage().beruf.sendKeys(string);
        new BasePage().berechnenBtn.click();
    }
}
