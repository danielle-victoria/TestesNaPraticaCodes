package one.digitalinnovation.pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage{

    //Locators
    private By menuDressesLocator = By.cssSelector("#cm-header-navigation > div.cm-layout-max.mx-auto.flex.justify-center.items-center.gap-2 > div.overflow-hidden.-my-4 > div > div:nth-child(4) > a > span.whitespace-nowrap.group-1-hover/:text-/[color/:var/(--cm-color-hover-link/)/]");

    public void viewCasualDressesPage(){
        if(super.isDisplayed(menuDressesLocator)){
            super.actionMoveToElementPerform(menuDressesLocator);
        }else{
            System.out.println("menu dresses was not found");
        }

    }
    
}
