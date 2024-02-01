package swaglab;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglogin {
    static WebDriver driver;
    @Before
    public void setup(Scenario scenario){
        System.out.println("Scenario Name: "+scenario.getName());
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("Launch the url")
    public void launch_the_url() {
        driver.get("https://www.saucedemo.com/");
    }


    @When("Enter the valid username & password")
    public void enterTheValidUsernamePassword() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();

    }

    @Then("I should see the login succesfully")
    public void iShouldSeeTheLoginSuccesfully() {
//    driver.quit();
    }
    @After
    public void clean(Scenario scenario){

        System.out.println("Scenario STATUS: "+scenario.getStatus());

        TakesScreenshot tk = (TakesScreenshot) driver;
        scenario.attach(tk.getScreenshotAs(OutputType.BYTES),"image/png","Screenshot");

    }
}
