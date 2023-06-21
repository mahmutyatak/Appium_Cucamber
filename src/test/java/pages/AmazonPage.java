package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;

public class AmazonPage {
    public AmazonPage(){
            PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);
        }

    @FindBy(xpath = "//*[@id=\"nav-search-keywords\"]")
    public WebElement searchbox;
    @FindBy(xpath = "(//div[@class='sg-row'])[3]")
    public WebElement ilkurun;
    @FindBy(xpath = "(//span[@class='nav-ftr-text'])[10]")
    public WebElement musteriHzimetleri;


}
