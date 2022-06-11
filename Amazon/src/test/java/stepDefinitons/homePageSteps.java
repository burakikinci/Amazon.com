package stepDefinitons;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    homePage homePage = new homePage(driver);

    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        homePage.mainPage();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        homePage.clickSearchButton();
    }
    @When("Write {string} name")
    public void writeName(String product) {
        homePage.writingProduct(product);
    }


    @When("click search button")
    public void clickSearchButton() {
        homePage.clickingSearchButton();
    }



}
