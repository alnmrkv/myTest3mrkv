import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class main3 {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement input = driver.findElement(By.xpath("//Input[@aria-label='Найти']") );
        input.click();
        input.sendKeys("Калькулятор\n");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        input = driver.findElement(By.xpath("//div[@jsname='aN1RFf']"));input.click();
        input = driver.findElement(By.xpath("//div[@jsname='Pt8tGc']"));input.click(); //=
        driver.close();



    }
}

