package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
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
       amazonPage.ilkurun.click();
    }
}
