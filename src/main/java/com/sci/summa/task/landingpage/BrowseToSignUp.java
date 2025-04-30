package com.sci.summa.task.landingpage;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sci.summa.ui.automationexercise.AutomationExercise.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BrowseToSignUp implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(SIGN_IN),
                Click.on(SIGN_IN),

                WaitUntil.the(EMAIL_CREATE_ACCOUNT, isVisible())
        );
    }

    public static BrowseToSignUp browseToSignUp(){
        return new BrowseToSignUp();
    }
}