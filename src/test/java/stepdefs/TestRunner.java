package stepdefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"stepdefs"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:target/reports"},
        tags = "@smoke"
)
public class TestRunner {

    public static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        System.out.println("launching browser");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterClass
    public static void teardown() throws InterruptedException {
        if(driver!=null){
            Thread.sleep(5000);
            driver.quit();
            System.out.println("browser quit");
        }
    }




}
