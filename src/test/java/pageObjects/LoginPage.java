package pageObjects;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

public LoginPage(WebDriver ldriver){
    driver=ldriver;
    PageFactory.initElements(ldriver, this);
}


    @FindBy(id="email")
    WebElement email;

    @FindBy(id="pass")
    WebElement password;

    @FindBy(name="login")
    WebElement login;


    public void enterCredentials(String uname, String pass) throws InterruptedException {
        email.sendKeys(uname);
        Thread.sleep(4000);
        password.sendKeys(pass);
        Thread.sleep(4000);
        System.out.println("user enters "+uname + " And "+ pass);
    }

    public void clickLogin(){
       // login.click();
        System.out.println("user click on login");
    }




}
