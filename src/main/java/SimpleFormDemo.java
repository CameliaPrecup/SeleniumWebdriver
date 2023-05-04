import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleFormDemo {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("Web-driver.chrome.driver",
                "\"C:\\Users\\precu\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
        driver = new ChromeDriver();

    }


    @Test(priority = 1)
    public void singleInputfield(){
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys("test");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());

    }

    @Test
    public void checkThatTheInputFieldIsEmpty() {
        //
        /*1. Go to the "https://www.lambdatest.com/selenium-playground/simple-form-demo
          2.Clik on the Get Checked value button
          3.Check that the input field is empty
         */
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");false, yourMessage.isDisplayed());

    }





    }





