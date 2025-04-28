package com.sci.summa.ui.automationexercise;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

import static org.openqa.selenium.By.xpath;

public class AutomationExercise extends PageObject {

    public static final Target SIGN_IN = Target
            .the("Sign in")
            .located(xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a/text()"));

    public static final Target EMAIL_CREATE_ACCOUNT = Target
            .the("Email Address for Register")
            .located(xpath("//*[@data-qa=\"signup-email\"]"));
}