package com.sci.summa.stepdefinition.demosumma;

import com.sci.summa.stepdefinition.Setup;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sci.summa.task.signuppage.BrowseToSignUp.browseToSignUp;
public class SignUpTestStepDefinition extends Setup {

    private static final Logger LOGGER = LoggerFactory.getLogger(SignUpTestStepDefinition.class);
    private static final String LANDING_PAGE_ERROR = "UNABLE TO OPEN PAGE";
    private static final String LANDING_PAGE_DONE = "OPEN PAGE SUCCESSFULLY";

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("el usuario interactua con la pagina web")
    public void elUsuarioInteractuaConLaPaginaWeb() {

        try {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    browseToSignUp()
            );

        }catch (Exception e){
            LOGGER.error(e.getMessage(), e);
            LOGGER.warn(LANDING_PAGE_ERROR);
        }
    }

    @Then("debera obtener una respuesta")
    public void deberaObtenerUnaRespuesta() {

        try {

        }catch (Exception e){
            LOGGER.error(e.getMessage(), e);
            LOGGER.warn(LANDING_PAGE_ERROR);
        }
        LOGGER.info(LANDING_PAGE_DONE);
    }
}