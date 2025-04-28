package stepdefinition.demosumma;

import stepdefinition.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestStepDefinition extends Setup {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestStepDefinition.class);
    private static final String LANDING_PAGE_ERROR = "UNABLE TO OPEN PAGE";
    private static final String LANDING_PAGE_DONE = "OPEN PAGE SUCCESSFULLY";

    @When("el usuario interactua con la pagina web")
    public void elUsuarioInteractuaConLaPaginaWeb() {

        try {

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
