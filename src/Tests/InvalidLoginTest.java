package Tests;


import Base.BaseTest;
import PageObjects.LoginPage;
import org.junit.jupiter.api.Test;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void invalidLogin(){

        LoginPage loginPage = new LoginPage();
        loginPage.clickLoginHome();
        loginPage.selectEmailField();
        loginPage.selectPasswordField();
        loginPage.clickSubmit();
    }


}
