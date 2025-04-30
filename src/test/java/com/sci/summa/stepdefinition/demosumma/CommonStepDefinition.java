package com.sci.summa.stepdefinition.demosumma;

import com.sci.summa.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sci.summa.task.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CommonStepDefinition extends Setup {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonStepDefinition.class);
    private static final String ACTOR_NAME = "Cliente";
    private static final String LANDING_PAGE_ERROR = "UNABLE TO OPEN LANDING PAGE";

    @Given("el usuario ingresa a la pagina web")
    public void elUsuarioIngresaALaPaginaWeb() {

        try{
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage(), e);
            LOGGER.warn(LANDING_PAGE_ERROR);
        }
    }
}
