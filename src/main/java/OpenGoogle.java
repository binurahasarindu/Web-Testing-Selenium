//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    //Open Google
    //Go to Google home page

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
       // driver.quit();
    }
}
