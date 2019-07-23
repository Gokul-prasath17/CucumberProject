package RegistrationCheck;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature_Files/Registration.feature",plugin="json:target/reportReg17.json")
public class RunFile {

}
