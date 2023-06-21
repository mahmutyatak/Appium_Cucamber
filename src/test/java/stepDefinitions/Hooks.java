package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.BrowserDriver;


public class Hooks {
    @AfterStep
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) BrowserDriver.getBrowserDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }

    }
}
