package swaglab;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import javax.swing.border.AbstractBorder;

@CucumberOptions(features = "src/test/java/swaglab",glue = "swaglab",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class swgTestRunner extends AbstractTestNGCucumberTests {
}
