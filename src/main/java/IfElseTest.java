import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IfElseTest {

    @Test
    public void testPagerTitle(){
        System.out.println("Launching Chrome browser ..");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://google.com");

        //verify the page title
        String expPageTitle = "Google";
        boolean flag = false ;
        if (driver.getTitle().equalsIgnoreCase(expPageTitle)) {
            flag = true ;
            //this method returns True when the page title matches with specified string
            System.out.println("Page title matched");
        }
        Assert.assertTrue(flag, "Page title is not matching with expected");
        driver.quit();
    }


    }



