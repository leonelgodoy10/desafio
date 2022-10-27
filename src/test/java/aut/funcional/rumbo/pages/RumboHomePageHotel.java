package aut.funcional.rumbo.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePageHotel extends SeleniumWrapper {

    public RumboHomePageHotel(WebDriver driver) {
        super(driver);
    }
    //locators
    By BtnaceptarCookiesLocator = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");
    By btnHotelLocator = By.xpath("//div[@class='display-1dpcy4y-HubNavigationMenu-styled e10w470p3']//a[@title='Hoteles'][normalize-space()='Hoteles']");
    By pagoFraccionadoLocator = By.xpath("//body/div/div[contains(@class,'e19fnmvl0 display-f38482-HubRow-withBoxModel-withBoxModel e1gf7ux32')]/div[contains(@class,'hub-container mobile e1gf7ux30 display-1d1x1j2-Container-layouts-layouts-HubRow-HubRow eg3h3jz0')]/div[contains(@class,'e5okb9y0 display-vdrm12-Row-styles-scrollbars-Row-styles e1sskiuc0')]/div[4]/div[1]/div[3]/a[1]");
    By btnEchaleUnVistazoLocator = By.xpath("//a[normalize-space()='Échale un vistazo']");


    //methods

    public void aceptarCookie(){
        click(BtnaceptarCookiesLocator);
    }
    public void selectorHotel(){
        click(btnHotelLocator);
    }
    public void selecionarFraccionado(){
        click(pagoFraccionadoLocator);
    }
    public void echaleUnVistazo(){
        click(btnEchaleUnVistazoLocator);
    }
    public String textoUrlTitulo(){
        return getUrlTitle();
    }
    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
