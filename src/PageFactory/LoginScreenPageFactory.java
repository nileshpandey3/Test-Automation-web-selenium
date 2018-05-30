package PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScreenPageFactory {


        WebDriver driver = new ChromeDriver();
        public WebElement email = ((ChromeDriver) driver).findElementById("email");
        public WebElement passWord = ((ChromeDriver) driver).findElementById("password");
        public WebElement submit = ((ChromeDriver) driver).findElementById("submit");


}
