package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by diego on 04/07/20.
 */
public class PageObjects {

    private final WebDriver driver;

    @FindBy(id = "btnAdicionarCarrinho")
    public WebElement btnAdicionarCarrinho;

    @FindBy(className = "decline-button")
    public WebElement declineButton;

    @FindBy(id = "i15253178")
    private WebElement imgIphoneXr;

    public PageObjects(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void adicionarAoCarrinho() {
        btnAdicionarCarrinho.click();
    }

    public void naoAceitarGarantia() {
        declineButton.click();
    }

    public boolean isIphoneXRDisplayed(){
        return imgIphoneXr.isDisplayed();
    }
}
