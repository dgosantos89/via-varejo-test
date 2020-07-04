package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.PageObjects;

import java.net.URISyntaxException;

public class Stepdefs {
    private WebDriver driver;
    private PageObjects page;
    private static String IPHONE_URL="http://www.casasbahia.com.br/iPhone/iphone-xr-apple-preto-64gb-tela-retina-lcd-de-61-ios-12-camera-traseira-12mp-resistente-a-agua-e-reconhecimento-facial-15253178.html";

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("user-agent=Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        page = new PageObjects(driver);
    }

    @Dado("que esteja na pagina do Iphone XR")
    public void que_esteja_na_pagina_do_Iphone_XR() throws URISyntaxException {
        driver.get(IPHONE_URL);
    }

    @Quando("clicar em comprar")
    public void clicar_em_comprar() throws InterruptedException {
        page.adicionarAoCarrinho();
    }

    @Quando("clicar em continuar sem garantia extendida")
    public void clicar_em_continuar_sem_garantia_extendida() {
        page.naoAceitarGarantia();
    }

    @Entao("o Iphone XR devera ir para o carrinho")
    public void o_Iphone_XR_deverá_ir_para_o_carrinho() {
        Assert.assertTrue(page.isIphoneXRDisplayed());
    }

    @After
    public void close() {
        driver.close();
    }
}
