package one.digitalinnovation.pages;

import org.openqa.selenium.By;
import javafx.scene.control.Alert;

public class RegisterPage extends BasePage{

    //Locators
    private By registerLocator = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/p/span[2]");
    private By emailAddressLocator = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/ul/li/form/div[2]/label/input");
    private By passwordLocator = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/ul/li/form/div[3]/label/input");
    private By reEnterPasswordLocator = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/ul/li/form/div[4]/label/input");
    private By submitBtnLocator = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/ul/li/form/button");
    
    public void insertDataToRegister(){
        if(super.isDisplayed(emailAddressLocator)){
            super.type("daniellevicse@gmail.com", emailAddressLocator);
            super.type("457812hellojava", passwordLocator);
            super.type("457812hellojava", reEnterPasswordLocator);
            //super.actionMoveToElementClickPerform(submitBtnLocator);
        }else{
            System.out.println("data textbox was not present");
        }
           

    }

    public void clickOnButton(){
        click(submitBtnLocator);
        
    }

            
}
