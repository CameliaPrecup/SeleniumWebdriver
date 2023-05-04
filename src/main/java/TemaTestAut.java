import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class TemaTestAut {

    public String baseUrl = "http://www.google.com/";

    public WebDriver driver = new ChromeDriver();

    @Test

    public void findImage() {

        driver.get(baseUrl);
        // Accept cookies
        WebElement cookies = driver.findElement(By.id("L2AGLb"));
        cookies.click();
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
        // Enter something to search for
        element.sendKeys("Chartreux");

        element.submit();

        WebElement imagesLink = driver.findElement(By.linkText("Imagini"));

        imagesLink.click();



    }
    @Test
    public void firstFind () {
        driver.get(baseUrl);
        // Accept cookies
        WebElement cookies = driver.findElement(By.id("L2AGLb"));
        cookies.click();
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
        // Enter something to search for
        element.sendKeys("Chartreux");

        element.submit();
        driver.findElement(By.partialLinkText("Wikipedia")).click();
        driver.quit();
    }

    @Test
    public void Stergere () {
        driver.get(baseUrl);
        // Accept cookies
        WebElement cookies = driver.findElement(By.id("L2AGLb"));
        cookies.click();
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
        // Enter something to search for
        element.sendKeys("Chartreux");

        element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[1]"));
        element.click();
        driver.quit();






        }








}
