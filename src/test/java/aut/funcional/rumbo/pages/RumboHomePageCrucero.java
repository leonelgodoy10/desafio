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
    By BtnaceptarCookiesLocator = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");
    By verMasLocator = By.xpath("//body/div/div[contains(@class,'e19fnmvl0 display-r41hps-HubRow-withBoxModel-withBoxModel e1gf7ux32')]/div[contains(@class,'mobile e1gf7ux30 display-bpt8tl-Container-HubRow eg3h3jz0')]/div[contains(@class,'e5okb9y0 hub-no-gutters display-j4ga9b-Row-styles e1sskiuc0')]/div[contains(@class,'hub-col-md-12 hub-col-12 hub-col display-1k9w8js-Column-styles-Column-styles e1i8mjyc0')]/div[contains(@class,'e19fnmvl0 content-wrapper display-9axkc6-HubColumn-styles-withBoxModel-withBoxModel e1151aq91')]/div[contains(@class,'notranslate e19fnmvl0 display-14wpwcp-HubNavigation-styled-HubNavigation-styled-withBoxModel-withBoxModel e1k86xxr1')]/div[contains(@class,'display-kixg3l-HubNavigation-styled e1k86xxr0')]/div[contains(@class,'display-1dpcy4y-HubNavigationMenu-styled e10w470p3')]/div[contains(@class,'display-1dsq6h9-HubNavigationMenu-styled e10w470p2')]/ul[contains(@class,'display-5ue5gp-HubNavigationMenu-styled e10w470p1')]/li[contains(@class,'display-1eyezhb-HubNavigationMenu-styled-HubNavigationMenu-styled e10w470p0')]/div[1]");
    By crucerosLocator = By.xpath("//div[contains(@class,'display-1dpcy4y-HubNavigationMenu-styled e10w470p3')]//a[contains(@title,'Cruceros')][normalize-space()='Cruceros']");
    By navegarOfertasLocator = By.xpath("//body/div[@class='container container-home']/crs-home-offers/section[@class='crs-offers']/header[@class='crs-offers__header']/div[@class='crs-offers__utils']/crs-btn[@classname='crs-offers-btn-next']/button[@class='crs-btn crs-btn--secondary crs-btn--small crs-btn--outline crs-btn--icon crs-offers-btn-next ng-star-inserted']/span[@class='crs-icon ng-star-inserted']/*[1]//*[name()='svg']");
    By verTodasLasOfertasLocator = By.xpath("//a[@title='Ver todas las ofertas']");

    //methods
    public void aceptarCookie() {
        click(BtnaceptarCookiesLocator);
    }

    public void seleccionarVerMas() {
        click(verMasLocator);
    }

    public void seleccionarCrucero() {
        click(crucerosLocator);
    }

    public String textoUrlTitulo() {
        return getUrlTitle();
    }

    public void navegarOfertas() {
        for (int i = 0; i < 3; i++) {
            click(navegarOfertasLocator);
        }
    }
    public void verTodasLasOfertas() {
        click(verTodasLasOfertasLocator);
    }
    public void scrollPage(int horizontal,int vertical){
        scroll(horizontal,vertical);
    }

    public void navegarAlHome() {
        navigateTo(BASE_URL_AUT);
    }


}
