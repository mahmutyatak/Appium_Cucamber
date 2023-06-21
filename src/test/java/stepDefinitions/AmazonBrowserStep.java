package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utils.BrowserDriver;
import utils.ReausableMethods;

public class AmazonBrowserStep {

AmazonPage amazonPage=new AmazonPage();
    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String amazon) {
        BrowserDriver.getBrowserDriver().get(amazon);
        ReausableMethods.wait(15);
    }

    @Then("Kullanici arama kutusunda {string} aratir")
    public void kullaniciAramaKutusundaAratir(String aranacakKleime) {
       amazonPage.searchbox.sendKeys(aranacakKleime, Keys.ENTER);
       Actions actions=new Actions(BrowserDriver.getBrowserDriver());
       //actions.sendKeys(Keys.PAGE_DOWN); BUNU Bİ DENEYELİM.
     ReausableMethods.scrollToElement(amazonPage.musteriHzimetleri);
     ReausableMethods.wait(8);
     amazonPage.musteriHzimetleri.click();

    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        BrowserDriver.quitAppiumDriver();
    }
}
