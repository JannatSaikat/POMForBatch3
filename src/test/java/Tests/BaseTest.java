package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {


    WebDriver driver;

    //Set up driver,  Invoke browser
    void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
    }
    
    void implicitWait(long wait){

        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
    }

    void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    void rejectAlert(){

//        driver.switchTo().alert().dismiss();
    }
}
