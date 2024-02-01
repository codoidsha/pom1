package login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import javax.swing.border.AbstractBorder;

@CucumberOptions(features = {"src/test/java"},glue = {""},
tags = "@loginSuccess or @loginSuccess",
plugin = {"teamcity", "html:shaveen.html"})

public class TestrunnerLOGIN extends AbstractTestNGCucumberTests {


}
