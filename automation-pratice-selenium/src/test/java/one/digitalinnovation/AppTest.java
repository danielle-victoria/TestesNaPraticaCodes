package one.digitalinnovation;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private WebDriver driver;
    
    @Test
    public void helloSelenium()
    {
       //https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //setar propriedade ->onde está o driver do sistema
       driver = new ChromeDriver();
       //driver.manage().window().maximize();
       driver.get("https://noracora.com/collections/bestsellers?utm_source=bing&utm_medium=cpc&utm_adgroup=Rosegal-0112&utm_campaign=%E5%8C%97%E7%BE%8E-Search-C2-%E5%A4%9A-%E7%AB%9E-0513-%E5%B0%BDA&utm_keyword=rosegal%20boho%20dresses&msclkid=c5df32c8ced2108075335107d31b2c3e&utm_term=rosegal%20boho%20dresses&utm_content=Rosegal-0112");
       
       String currentUrl = driver.getCurrentUrl();
       String expected = "https://noracora.com/collections/bestsellers?utm_source=bing&utm_medium=cpc&utm_adgroup=Rosegal-0112&utm_campaign=%E5%8C%97%E7%BE%8E-Search-C2-%E5%A4%9A-%E7%AB%9E-0513-%E5%B0%BDA&utm_keyword=rosegal%20boho%20dresses&msclkid=c5df32c8ced2108075335107d31b2c3e&utm_term=rosegal%20boho%20dresses&utm_content=Rosegal-0112";
       
       Assertions.assertEquals(expected, currentUrl);

       //driver.quit();
    }  

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
