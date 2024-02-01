package ECommers;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class user1 {
    protected WebDriver driver;
    @Before
    public void setup(){
        driver = new ChromeDriver();
    }


    @Given("launch the url")
    public void launchTheUrl() {
        driver.get("");
    }

    @When("enter  valid username & password")
    public void enterValidUsernamePassword() {
        driver.findElement(By.name("email")).sendKeys("dishaveen10@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("");

    }

    @Then("i should see the login successful")
    public void iShouldSeeTheLoginSuccessful() {
    }
}
