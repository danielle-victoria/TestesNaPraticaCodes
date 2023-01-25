package one.digitalinnovation.tests;

import one.digitalinnovation.pages.*;
import org.junit.jupiter.api.Test;

import one.digitalinnovation.pages.DressesPage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class DressesPageTest {

    private DressesPage dressesPage;
    private final String URL = "https://noracora.com";

    @BeforeEach
    public void setUp() throws Exception{
        this.dressesPage = new DressesPage();
        this.dressesPage.visit(this.URL);
        
    }

    @AfterEach
    public void tearDown() throws Exception{
        this.dressesPage.quitWebDriver();
        
    }

    @Test
    void test(){
        //when
        this.dressesPage.viewCasualDressesPage();

        //then
        //Assertions.assertEquals("Casual Dresses", this.dressesPage.getTitlePage());
        Assertions.assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));

    }
    
}
