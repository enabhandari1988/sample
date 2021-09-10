package Java.Objects.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    WebDriver driver;
    @FindBy(xpath = ".//div/input[contains(@name,'q')]")
    WebElement searchSinger;
    @FindBy(xpath = "//*[@id=\"rso\"]/div[3]")
    WebElement searchResult;
    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public GoogleSearchPage() {

    }

    public void searchTheSinger(String name)
    {
        searchSinger.isSelected();
        searchSinger.sendKeys(name);
        searchSinger.sendKeys(Keys.ENTER);

    }

    public String checkSearchResult()
    {
        String text = searchResult.getText();
        return text;
    }
}
