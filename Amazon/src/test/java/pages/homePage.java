package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class homePage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;
    By SearchButton = By.cssSelector("#twotabsearchtextbox");
    By CircularButton = By.cssSelector("#nav-search-submit-button");


    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);}


    public void mainPage() {
        driver.get("https://www.amazon.com.tr/");
    }

    public void clickSearchButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(SearchButton));
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
    }

    public void writingProduct(String pro) {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("airpods pro");
    }

    public void clickingSearchButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(CircularButton));
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
    }


}


