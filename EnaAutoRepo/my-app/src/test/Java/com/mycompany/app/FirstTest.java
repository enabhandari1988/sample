package Java.com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;

public class FirstTest {
    public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
         driver.get("http://www.google.com/");
         WebElement googleSearch = driver.findElement(By.xpath(".//div/input[contains(@name,'q')]"));
         googleSearch.sendKeys("Adele");
         googleSearch.sendKeys(Keys.ENTER);
         driver.close();

    }

}
