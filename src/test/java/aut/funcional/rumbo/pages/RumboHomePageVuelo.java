package aut.funcional.rumbo.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePageVuelo extends SeleniumWrapper {

    public RumboHomePageVuelo(WebDriver driver) {
        super(driver);
    }

    //locators
    By BtnaceptarCookiesLocator = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");
    By vueloslocator = By.xpath("//div[@class='display-1dpcy4y-HubNavigationMenu-styled e10w470p3']//a[@title='Vuelos'][normalize-space()='Vuelos']");
    By btnBuscarVueloLocator = By.xpath("//button[normalize-space()='Buscar']");
    By mensajeErrorVueloLocator = By.xpath("//span[@class='display-1jbu58d-ValidationMessage-styled-ValidationMessage-styled-ValidationMessage-styled']");

    //methods
    public void vueloVacior(){

        click(BtnaceptarCookiesLocator);
        click(vueloslocator);
        click(BtnaceptarCookiesLocator);
        click(btnBuscarVueloLocator);
        Assertions.assertEquals("Introduce ciudad o aeropuerto de destino",getText(mensajeErrorVueloLocator));
        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo",getUrlTitle());
    }
    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
