<<<<<<< HEAD:src/test/java/com/sci/summa/runner/SignUpTest.java
package com.sci.summa.runner;
=======
package runner;
>>>>>>> 8704a12d6d2aa7387868311c1e9ec795e2b57b0b:src/test/java/runner/SignUpTest.java

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
<<<<<<< HEAD:src/test/java/com/sci/summa/runner/SignUpTest.java
        features = {"src/test/resources/features/SignUpTest.feature"},
        glue = {"com.sci.summa.stepdefinition.demosumma"},
        tags = {""}
)
public class SignUpTest {
}
=======
        features = {"src/test/resources/features/signup.feature"},
        glue = {"stepdefinition.demosumma"},
        tags = {""}
)
public class SignUpTest {
}
>>>>>>> 8704a12d6d2aa7387868311c1e9ec795e2b57b0b:src/test/java/runner/SignUpTest.java
