package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class AileButcemPage {

    public AileButcemPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }
    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public MobileElement girisYapButton;
    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public MobileElement Email_AdresiButton;
    @FindBy(xpath = "//*[@text='Şifre']")
    public MobileElement sifreButton;
    @FindBy(xpath = "//*[@text='Başarılı']")
    public MobileElement basariliYazisi;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public MobileElement menuButton;

    @FindBy(xpath = "//*[@text='Hesabım']")
    public MobileElement hesabim;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimYazisi;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyisimYazisi;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslekYazisi;
    @FindBy(xpath = "//*[@text='Kaydet']")
    public MobileElement kaydet;




}
