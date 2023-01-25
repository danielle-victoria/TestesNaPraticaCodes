package one.digitalinnovation.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import one.digitalinnovation.pages.LoginPage;

public class LoginPageTest {

    private LoginPage loginPage;
    private final String URL = "https://noracora.com/account/login";

    @BeforeEach
    public void setUp() throws Exception{

        this.loginPage = new LoginPage();
        this.loginPage.visit(this.URL);
    }

    @AfterEach
    public void tearDown() throws Exception{
        this.loginPage.quitWebDriver();

    }

    @Test
    void test(){
        //when
        loginPage.signIn();

        //then
        //Assertions.assertTrue(this.loginPage.getMyAccountMessage().equals("MY ACCOUNT"));
        Assertions.assertTrue(this.loginPage.getCurrentUrl().equals(this.URL));

    }
    
}
