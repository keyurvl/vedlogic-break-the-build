package AutomationTest.vedlogic.hooks;

import AutomationTest.vedlogic.BrowserSetup;
import AutomationTest.vedlogic.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

    @Before
    public void beforeUiScenario() {
        BrowserSetup browserSetup = new BrowserSetup();
        browserSetup.initializeBrowser();
        browserSetup.initializeBrowser();
    }

    @After
    public void afterUiScenario(Scenario scenario) {
        DriverManager.getDriver().close();
    }
}
