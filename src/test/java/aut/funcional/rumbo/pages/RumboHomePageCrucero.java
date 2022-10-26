package aut.funcional.rumbo.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePageCrucero extends SeleniumWrapper {

    public RumboHomePageCrucero(WebDriver driver) {
        super(driver);
    }

    //locators
    By vueloslocator = By.xpath("//div[@class='display-1dpcy4y-HubNavigationMenu-styled e10w470p3']//a[@title='Vuelos'][normalize-space()='Vuelos']");
    By btnBuscarVueloLocator = By.xpath("//button[normalize-space()='Buscar']");
    By mensajeErrorVueloLocator = By.xpath("//span[@class='display-1jbu58d-ValidationMessage-styled-ValidationMessage-styled-ValidationMessage-styled']");
    By BtnaceptarCookies = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");

    //methods
    public void vueloVacior(){

        click(BtnaceptarCookies);
        click(vueloslocator);
        click(BtnaceptarCookies);
        click(btnBuscarVueloLocator);
        Assertions.assertEquals("Introduce ciudad o aeropuerto de destino",getText(mensajeErrorVueloLocator));


    }


    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
