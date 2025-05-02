package com.sci.summa.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

// ./gradlew test --tests *com.sci.summa.runner.SignUpTest* --tests *com.sci.summa.runner.OpenWebTest* aggregate -i

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/signup_test.feature"},
        glue = {"com.sci.summa.stepdefinition.demosumma"},
        tags = {""}
)
public class SignUpTest {
}
