package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class secondPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;
    By CookieButton = By.cssSelector("#sp-cc-accept");
    By Brand = By.xpath("//span[@class='a-size-base a-color-base'][contains(text(),'Amazon Tarafından Gönderilir')]");
    By page2 = By.cssSelector("a[aria-label='Sonraki sayfaya git, sayfa 2']");
    By addToChart = By.cssSelector("#add-to-cart-button");

    public secondPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickCookies() {
        wait.until(ExpectedConditions.presenceOfElementLocated(CookieButton));
        driver.findElement(By.cssSelector("#sp-cc-accept")).click();
    }

    public void filteringDone() {
        wait.until(ExpectedConditions.presenceOfElementLocated(Brand));
        driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][contains(text(),'Amazon Tarafından Gönderilir')]")).click();
    }

    public void changePage() {
        driver.findElement(page2).sendKeys(Keys.CONTROL, Keys.END);
        driver.findElement(By.cssSelector("a[aria-label='Sonraki sayfaya git, sayfa 2']")).click();
    }

    public void clickFirstProductofSecondPage(String firstProduct) {
        List<WebElement> elements = driver.findElements(By.cssSelector(".a-size-base-plus.a-color-base.a-text-normal"));
        for (WebElement element : elements) {
            element.click();
            break;
        }
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();

    }
}
