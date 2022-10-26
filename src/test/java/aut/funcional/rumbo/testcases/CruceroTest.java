package aut.funcional.rumbo.testcases;

import aut.funcional.rumbo.pages.RumboHomePageCrucero;
import aut.funcional.rumbo.pages.RumboHomePageVuelo;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class CruceroTest extends SeleniumTestBase {

    RumboHomePageCrucero rumboHomePageCrucero;

    @Test
    void busquedaVueloVacio(){
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
    }
}
