package PageObjects;

import Base.BaseTest;
import PageFactory.LoginHomePageFactory;
import PageFactory.LoginScreenPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    LoginHomePageFactory loginHomePageFactory = new LoginHomePageFactory();
    LoginScreenPageFactory loginScreenPageFactory = new LoginScreenPageFactory();

    public void LoginHomePage(){

        PageFactory.initElements(driver, loginHomePageFactory);
    }

    public void LoginScreenPage(){
        PageFactory.initElements(driver,loginScreenPageFactory);
    }

    public void clickLoginHome(){

        loginHomePageFactory.LoginButton.click();


    }

    public void selectEmailField(){

        loginScreenPageFactory.email.clear();
        loginScreenPageFactory.email.sendKeys("123@gmail.com");

    }

    public void selectPasswordField(){
        loginScreenPageFactory.passWord.clear();
        loginScreenPageFactory.passWord.sendKeys("random");
    }

    public void clickSubmit(){

        loginScreenPageFactory.submit.click();
    }


}
