import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonExample {

        WebDriver driver;

        @BeforeMethod
        public void openLinkTestPage() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01kykehonm9y9ebyucj1wzav8k6072746.node0");
        }

        @Test
        public void buttonTests(){
         // 01).click and confirm title
            driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
            String expectedTitle = "Dashboard";
            String actualTitle = driver.getTitle();
            if(expectedTitle.equals(actualTitle)){
                System.out.println("Actual Title  expected");
            } else {
                System.out.println("Actual Title  not same as  expected");
            }

        }



}
