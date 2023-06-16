package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AileButcemPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReausableMethods;

import java.time.Duration;

public class AileButcemStep {
AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver();
TouchAction action=new TouchAction(driver);
AileButcemPage aileButcemPage=new AileButcemPage();
    @Given("Kullanici kurulumlari tamamlar")
    public void kullanici_kurulumlari_tamamlar() {
      Assert.assertTrue(driver.isAppInstalled("com.ailebutcem"));
    }
    @Then("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {
        Thread.sleep(2000);
        for (int i = 0; i <7 ; i++) {
            action.press(PointOption.point(737,1014)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(155,1006)).release().perform();
        }
        aileButcemPage.girisYapButton.click();
    }
    @Then("mail ve password bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin() {
        aileButcemPage.Email_AdresiButton.sendKeys(ConfigReader.getProperty("mail"));
        aileButcemPage.sifreButton.sendKeys(ConfigReader.getProperty("password"));
        aileButcemPage.girisYapButton.click();

    }
    @Then("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        String expected="Başarılı";
        String actual=aileButcemPage.basariliYazisi.getText();
        System.out.println(actual);
        Assert.assertEquals("basariszi giris",expected,actual);

    }
    @Then("sol kisimdaki menuden hesabim bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin() {
        ReausableMethods.wait(5);
        aileButcemPage.menuButton.click();
        ReausableMethods.wait(2);
        aileButcemPage.hesabim.click();

    }
    @Then("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin() {
        aileButcemPage.isimYazisi.clear();
        aileButcemPage.isimYazisi.sendKeys("furkan");
        aileButcemPage.soyisimYazisi.clear();
        aileButcemPage.soyisimYazisi.sendKeys("kral");
        aileButcemPage.meslekYazisi.clear();
        aileButcemPage.meslekYazisi.sendKeys("the king in the north");
        aileButcemPage.kaydet.click();

    }
    @Then("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin() {
        String expected="Başarılı";
        String actual=aileButcemPage.basariliYazisi.getText();
        System.out.println(actual);
        Assert.assertEquals("basariszi giris",expected,actual);
        ReausableMethods.wait(3);
        driver.closeApp();

    }
}
