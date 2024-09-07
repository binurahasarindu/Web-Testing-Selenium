import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01lhjbpo3yd054u0zudexumyjg5945034.node0");
    }

    @Test
    public void textBoxTests(){

        //01)Type your name
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Binura Hasarindu");

        //02)Append Contry to this city
        WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("Sri Lanka");

        //03)Verify if text box is disabled
        boolean enabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is text Box enabled" + enabled);
        //04)Clear the typed text
        ////*[@id="j_idt88:j_idt95"]
       WebElement clearText =  driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
        clearText.clear();

        //05)Retrive the typed text
        WebElement retriver1 = driver.findElement(By.id("j_idt88:j_idt97"));
        retriver1.getAttribute("value");

        //06) Type email and tab.Confirm control moved to next element.
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("bhasarindu@gmail.com" + Keys.TAB + "Confirmed control moved to next element");

    }
}
