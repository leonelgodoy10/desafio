package aut.funcional.rumbo.testcases;

import aut.funcional.rumbo.pages.RumboHomePageCrucero;
import aut.funcional.rumbo.pages.RumboHomePageVuelo;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class CruceroTest extends SeleniumTestBase {

    RumboHomePageCrucero rumboHomePageCrucero;

    @Test
    void despliegueBarraDeslizante() throws InterruptedException {
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        Assertions.assertEquals("Cruceros. Ofertas de cruceros baratos. Tu crucero en Rumbo",rumboHomePageCrucero.textoUrlTitulo());
        rumboHomePageCrucero.scrollPage(0,1200);
        Thread.sleep(1000);
        rumboHomePageCrucero.navegarOfertas();
        rumboHomePageCrucero.verTodasLasOfertas();
        Assertions.assertEquals("Cruceros",rumboHomePageCrucero.textoUrlTitulo());
    }

}
