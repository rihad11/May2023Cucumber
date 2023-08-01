package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginSteps {

    public static WebDriver driver;


    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void teardown() throws InterruptedException {
        if(driver!=null){
            Thread.sleep(5000);
            driver.quit();
        }
    }



    @Given("user in login page")
    public void user_in_login_page() {

        driver.get("https://www.facebook.com");

        System.out.println(driver.getTitle());
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.id("email")).sendKeys("rhasan@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("Abc!2345");

        System.out.println("When step - user enters credentials");
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String uname, String pass) {
        driver.findElement(By.id("email")).sendKeys(uname);
        driver.findElement(By.id("pass")).sendKeys(pass);
        System.out.println("user enters :"+ uname + " /n user enters : "+ pass);
    }



    @And("user click submit")
    public void user_click_submit() {

      //  driver.findElement(By.name("login")).click();
        System.out.println("And step");
    }

    @Then("user successfully login")
    public void user_successfully_login() {
        Assert.assertEquals("Facebook - log in or sign up", driver.getTitle());
        System.out.println("Then step");
    }
}
