package one.digitalinnovation.pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage{

    //Locators
    private By menuDressesLocator = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[4]/a/span[1]");
    private By submenuCasualDressesLocator = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[5]/div/div/div[1]/a[2]/span");
    private By titlePageCasualDressesLocator = By.tagName("h1");

    public void viewCasualDressesPage(){
        if(super.isDisplayed(menuDressesLocator)){
            super.actionMoveToElementPerform(menuDressesLocator);
            super.actionMoveToElementClickPerform(submenuCasualDressesLocator);
        }else{
            System.out.println("menu dresses was not found");
        }

    }

    public String getTitlePage(){
        return super.getText(titlePageCasualDressesLocator);
    }
    
}
