package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    public WebDriver driver;
    @Given("User Launch The Chrome Browser")
    public void userLaunchTheChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("User Open URL {string}")
    public void userOpenURL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Then("Page Title should be {string}")
    public void pageTitleShouldBe(String title) {
       String actTitle = driver.getTitle();
        Assert.assertEquals("Title is : "+actTitle,actTitle,title);
    }

    @And("Close the Browser")
    public void closeTheBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
