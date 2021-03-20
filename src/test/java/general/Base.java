package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver;  // objeto do Selenium WebDriver, vulgo bola
    // ^ - ao usar PageFactory mudar de public para protected

    //v - criar um construtor e inicializar os elementos dp PagFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
