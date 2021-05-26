package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    @FindBy (xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement signinButton;
    @FindBy (xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1")
    WebElement siginText;
    @FindBy (css = "[class=\"a-icon a-icon-logo\"]" )
    WebElement signinLogo;
    @FindBy (xpath = "//*[@class='navFooterLinkCol navAccessibility']/ul/li[" + "i" + "]")
    WebElement footerElement;
    @FindBy (xpath = "//*[@class='nav_a']")
    List<WebElement> fotterLinks;

    public void clickSigninButton(){
        signinButton.click();

    }

    public String getsigninText(){
       String text = siginText.getText();
       return text;
    }

    public void clickLogoOnSignin(){
        signinLogo.click();
    }

    public ArrayList<String> getTextFromFooter(){
        ArrayList<String> actualTexts = new ArrayList<String>();


        for(int i = 0; i < 6; i++){
          actualTexts.add(fotterLinks.get(i).getText());
        }
        return actualTexts;
    }
}
