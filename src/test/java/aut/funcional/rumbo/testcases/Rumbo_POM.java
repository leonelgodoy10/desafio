package aut.funcional.rumbo.testcases;

import aut.funcional.rumbo.pages.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class Rumbo_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePageHomePage;

    @Test
    void busquedaVueloVacio(){
        rumboHomePageHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePageHomePage.navegarAlHome();
        rumboHomePageHomePage.vueloVacior();
    }
}
