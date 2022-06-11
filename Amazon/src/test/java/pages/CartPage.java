package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class CartPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);}
    By forGotoCartPage = By.cssSelector("a[class='a-button-text']");
    By CartText = By.cssSelector("#a-autoid-4-announce");
    By empty = By.cssSelector("div[data-action='delete'] span[class='a-size-base']");

    public void goCart(){
        wait.until(ExpectedConditions.presenceOfElementLocated(forGotoCartPage));
        driver.findElement(By.cssSelector("a[class='a-button-text']")).click();


    }
    public void checkCart(){
        wait.until(ExpectedConditions.presenceOfElementLocated(CartText));
        driver.findElement(By.cssSelector("#a-autoid-4-announce"));
    }
    public void remove(){
        driver.findElement(By.cssSelector("input[value='Sil']")).click();
    }

    public void checkEmpty() {
        wait.until(ExpectedConditions.presenceOfElementLocated(empty));
        driver.findElement(By.cssSelector("div[data-action='delete'] span[class='a-size-base']"));
    }

}
