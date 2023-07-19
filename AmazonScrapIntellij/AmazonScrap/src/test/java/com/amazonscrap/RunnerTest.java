package com.amazonscrap;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/features/02Search.feature"
},      glue = "com.amazonscrap",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)

public class RunnerTest extends AbstractTestNGCucumberTests {
}
