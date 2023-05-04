import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


public class LambdaTest {
    private WebDriver driver;
    @BeforeClass

    public void setup() {
        System.setProperty("Web-driver.chrome.driver",
                "\"C:\\Users\\precu\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
        driver = new ChromeDriver();
    }

   @Test
   public void SingleInputField1(){
           driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
           driver.findElement(By.id("user-message")).sendKeys("test");
           driver.findElement(By.id("showInput")).click();
           WebElement yourMessage = driver.findElement(By.id("message"));
           Assert.assertEquals(true, yourMessage.isDisplayed());

   }



}
