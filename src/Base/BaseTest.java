package Base;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected static WebDriver driver;

   @BeforeEach
    public void gotoMarcusUrl(){

       System.setProperty("webdriver.chrome.driver","/Users/nileshpandey/Downloads/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.marcus.com/us/en");
       driver.manage().window().maximize();

   }

   @AfterEach
    public  void closeBrowser(){
       WebDriver driver = new ChromeDriver();
       driver.quit();
   }


}
