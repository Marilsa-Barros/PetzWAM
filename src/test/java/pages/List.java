package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List extends Base {


    // 1- Mapeamento
    // Texto do Resultado Para
    @FindBy(css = "h1.h2Categoria nomeCategoria")
    private WebElement lblResultBy;


    // 2- Construtor

    public List(WebDriver driver) {
        super(driver);
    }


    // 3- Método e Funções baseados no Mapeamento

    // Ler o titulo da guia e devolve o texto encontrado
    public String readTitleTab(){
        return driver.getTitle();

    }

    // Ler a frase Rwesultado para "Produto"
    public String readResultBy(){
        return lblResultBy.getText();
    }


    // Clique no produto desejado
    public void clickAtDesiredProduct(String product){    //cliclar no produto desejado
        driver.findElement(By.xpath("//h3[contains(text(),'" + product + "')]")).click();

    }

}
