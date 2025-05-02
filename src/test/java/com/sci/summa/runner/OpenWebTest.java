package com.sci.summa.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/openweb_test.feature"},
        glue = {"com.sci.summa.stepdefinition.demosumma"},
        tags = {""}
)
public class OpenWebTest {
}
