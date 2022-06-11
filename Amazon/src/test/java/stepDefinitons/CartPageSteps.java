package stepDefinitons;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.homePage;
import util.DriverFactory;

public class CartPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    CartPage cartPage = new CartPage(driver);


    @When("Go to cart page")
    public void goToCartPage() {
        cartPage.goCart();
    }

    @When("Check at cart page")
    public void checkAtCartPage() {
        cartPage.checkCart();
    }

    @When("The product is removed from the basket")
    public void theProductIsRemovedFromTheBasket() {
        cartPage.remove();
    }


    @Then("Check that the basket is empty")
    public void checkThatTheBasketIsEmpty() {
        cartPage.checkEmpty();
    }
}
