package Tests;

import Pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HomePageTests extends BaseTest{

   HomePage homePage;
   String url = "https://amazon.com";

   @BeforeMethod
   void setupHomepage() {
       setup(); //Method from base test
       driver.get(url);
       homePage = PageFactory.initElements(driver, HomePage.class);
   }

   /*
   click on signin on Home page
   see Sign-in text
   */
   @Test
    void testSigninText(){
       homePage.clickSigninButton();
       String actualText = homePage.getsigninText();
       Assert.assertEquals(actualText, "Sign-In");
   }

   @Test
    void testLogoBringsToHomepage(){
       homePage.clickSigninButton();
       homePage.clickLogoOnSignin();
       String currentUrl = driver.getCurrentUrl();
       Assert.assertEquals(currentUrl,"https://www.amazon.com/ref=ap_frn_logo");
   }


   @Test
    void testFooterText(){
       String[] expectedTexts = {"Careers", "Blog", "About Amazon", "Investor Relations", "Amazon Devices", "Amazon Tours"};
       ArrayList<String>  actualTexts= homePage.getTextFromFooter();
       for (String text : expectedTexts) {
        Assert.assertTrue(actualTexts.contains(text));
       }
//       Assert.assertEquals(actualTexts, expectedTexts);
   }
}
