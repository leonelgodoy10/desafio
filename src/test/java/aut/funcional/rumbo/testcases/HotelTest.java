package aut.funcional.rumbo.testcases;

import aut.funcional.rumbo.pages.RumboHomePageHotel;
import aut.funcional.rumbo.pages.RumboHomePageVuelo;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelTest extends SeleniumTestBase {

    RumboHomePageHotel rumboHomePageHotel;

    @Test
    void funcionalidadPagoFraccionado(){
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selecionarFraccionado();
        rumboHomePageHotel.echaleUnVistazo();
        Assertions.assertEquals("Pago fraccionado | Rumbo",rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.selectorHotel();
        Assertions.assertEquals("Hoteles | Ofertas de Hoteles baratos | Rumbo",rumboHomePageHotel.textoUrlTitulo());

    }
}
