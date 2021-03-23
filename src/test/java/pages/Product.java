package pages;

import general.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.plaf.PanelUI;

public class Product extends Base {

    @FindBy(css = "div.col-md-7.prod-info:nth-child(6) > h1:nth-child(1)")
    private WebElement productTitle;

    @FindBy(css = "div.price-current")
    private WebElement priceCurrent;



    public Product(WebDriver driver) {
        super(driver);

    }

    // Lê o titulo da guia e devolve o texto encontrado
    public String readTitleTab(){
        return driver.getTitle();

    }

    // Ler o nome do produto
    public String readProductTitle(){
       return productTitle.getText();
    }

    // Ler o preço atual
    public String readPricecurrent(){
        return priceCurrent.getText();
    }
}
