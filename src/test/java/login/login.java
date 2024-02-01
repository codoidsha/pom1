package login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public WebDriver driver;

    @Given("launch url")
    public void launch_url() {
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("enter valid username & password")
    public void enterValidUsernamePassword() {
        driver.findElement(By.id("username")).sendKeys("student");

        driver.findElement(By.id("password")).sendKeys("Password123");

        driver.findElement(By.xpath("//button[@class='btn']")).click();

    }

    @Then("i should see the login succesfully")
    public void iShouldSeeTheLoginSuccesfully() {

        driver.quit();
    }

    @When("enter Invalid username & valid password")
    public void enterInvalidUsernamePassword() {

        driver.findElement(By.id("username")).sendKeys("Student");

        driver.findElement(By.id("password")).sendKeys("Password123");

        driver.findElement(By.xpath("//button[@class='btn']")).click();
    }

    @Then("i should see the login unsuccesfully")
    public void iShouldSeeTheLoginUnsuccesfully() {
        driver.quit();


    }

    @When("enter valid username & Invalid password")
    public void enterValidUsernameInvalidPassword() {
        driver.findElement(By.id("username")).sendKeys("student");

        driver.findElement(By.id("password")).sendKeys("Password1234");

        driver.findElement(By.xpath("//button[@class='btn']")).click();


    }

}


