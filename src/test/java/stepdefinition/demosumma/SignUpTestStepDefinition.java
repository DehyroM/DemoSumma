package stepdefinition.demosumma;

import stepdefinition.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sci.summa.task.landingpage.BrowseToSignUp.browseToSignUp;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SignUpTestStepDefinition extends Setup {

    private static final Logger LOGGER = LoggerFactory.getLogger(SignUpTestStepDefinition.class);
    private static final String SIGN_IN_PAGE_ERROR = "UNABLE TO OPEN SIGN IN PAGE";
    private static final String FILL_SIGN_IN_PAGE_ERROR = "UNABLE TO FILL USER DATA IN SIGN IN PAGE";
    private static final String SIGN_IN_VALIDATION_ERROR = "WRONG VALIDATION FOR SUCCESSFUL LOGIN IN SIGN IN PAGE";
    private static final String SIGN_IN_DONE = "SIGN IN DONE SUCCESSFULLY";

    @When("el cliente entra en la seccion Sign Up del sitio Web")
    public void elClienteEntraEnLaSeccionSignInDelSitioWeb() {

        try {
            theActorInTheSpotlight().attemptsTo(
                    browseToSignUp()
            );
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            LOGGER.warn(SIGN_IN_PAGE_ERROR);
        }
    }

    @When("el cliente ingresa sus datos personales y clickea el boton Create Account")
    public void elClienteIngresaSusDatosPersonalesYClickeaElBotonSignIn() {

        try {

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            LOGGER.warn(FILL_SIGN_IN_PAGE_ERROR);
        }
    }

    @Then("debera aparecer la confirmacion de creacion de la cuenta")
    public void deberaAparecerLaSeccionMYACCOUNTDelUsuarioLogueado() {

        try {

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            LOGGER.warn(SIGN_IN_VALIDATION_ERROR);
        }
        LOGGER.info(SIGN_IN_DONE);
    }
}