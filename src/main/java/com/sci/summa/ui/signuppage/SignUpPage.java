package com.sci.summa.ui.signuppage;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

import static org.openqa.selenium.By.xpath;

public class SignUpPage extends PageObject {

    public static final Target SIGN_UP = Target
            .the("Sign Up / Login")
            .located(xpath("//*[@href='/login']"));

    public static final Target EMAIL_CREATE_ACCOUNT = Target
            .the("Email for Create Account")
            .located(xpath("//*[@data-qa='signup-email']"));

}