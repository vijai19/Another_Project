package org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features" ,
                  glue = "org.stepdefinition",
                  monochrome = true,
                  dryRun = false
		)


public class Runneroflogin {


}
