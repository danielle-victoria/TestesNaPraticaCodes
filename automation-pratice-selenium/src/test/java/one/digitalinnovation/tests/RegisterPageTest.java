package one.digitalinnovation.tests;

import one.digitalinnovation.pages.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegisterPageTest {

    private RegisterPage registerPage;
    private final String URL = "https://noracora.com/account/login";

    @BeforeEach
    public void setUp() throws Exception{
        this.registerPage = new RegisterPage();
        this.registerPage.visit(this.URL);
        
    }

    @AfterEach
    public void tearDown() throws Exception{
        //this.registerPage.quitWebDriver();
        
    }

    @Test
    void test(){
        registerPage.insertDataToRegister();
        //registerPage.PermissionPopups();
        //registerPage.clickOnButton();
        //registerPage.PermissionPopups();

    }
    
}
