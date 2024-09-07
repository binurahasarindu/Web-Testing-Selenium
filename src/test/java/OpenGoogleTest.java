import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OpenGoogleTest {

    @Test
    public void googleTest(){
        ChromeOptions chromeoptions = new ChromeOptions();
        //chromeoptions.setBrowserVersion("122");
        chromeoptions.addArguments("start-maximized");
        chromeoptions.addArguments("--incognito");
        chromeoptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Matara" + Keys.ENTER);
        driver.quit();
     }
}
