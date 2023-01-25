package one.digitalinnovation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.junit.jupiter.api.Assertions;


public class LoginTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://noracora.com/account/login");

    }

    @AfterEach
    public void tearDown() throws Exception{
        //driver.quit();

    }

    @Test
    public void test() {
        WebElement emailAddressElement = driver.findElement(By.name("email"));
        emailAddressElement.sendKeys("danielle.victoriase@gmail.com");

        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys("457812hellojava");

        WebElement submitBtnElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/ul/li/form/div[1]/button"));
        submitBtnElement.click();

        /*WebElement tagP = driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div[1]/div[4]/p"));
        String textTagP = tagP.getText();

        Assertions.assertTrue(textTagP.equals("Subscribe to get exclusive 15% OFF NOW! And you can also receive novelties, trends, and promotions via email."));*/

        
       
    }
    
}
