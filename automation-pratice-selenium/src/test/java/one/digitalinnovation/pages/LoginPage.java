package one.digitalinnovation.pages;

import org.openqa.selenium.By;


public class LoginPage extends BasePage{

    //Locators
    private By emailAddressElement = By.name("email");
    private By passwordElement = By.name("password");
    private By submitBtnElement = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/ul/li/form/div[1]/button");
    //private By tagMyAccountLocator = By.tagName("h1");

    
    public void signIn(){
        if(super.isDisplayed(emailAddressElement)){ //Verifica se os campos estão disponíveis
            super.type("danielle.victoriase@gmail.com", emailAddressElement);
            super.type("457812hellojava", passwordElement);
            super.click(submitBtnElement);
        }else{
            System.out.println("email textbox was not present");
        }

    }

    /*public String getMyAccountMessage(){
        return super.getText(tagMyAccountLocator);
   /}*/

    
}
