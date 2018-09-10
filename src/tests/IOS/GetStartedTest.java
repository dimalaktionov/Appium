package tests.IOS;

import lib.iOSTestCase;
import lib.ui.WelcomePageObject;
import org.junit.Test;

public class GetStartedTest extends iOSTestCase
{
    @Test
    public void testPassThroughWelcome()
    {
        WelcomePageObject WelcomePage = new WelcomePageObject(driver);

        WelcomePage.waitForLearnMoreLink();
        WelcomePage.clickNextbutton();

        WelcomePage.waitForNewWayToExploreText();
        WelcomePage.clickNextbutton();

        WelcomePage.waitForAddOrEditPreferredLangText();
        WelcomePage.clickNextbutton();

        WelcomePage.waitForLearnMoreAboutDataCollectionText();
        WelcomePage.clickGetStartedButton();
    }

}
