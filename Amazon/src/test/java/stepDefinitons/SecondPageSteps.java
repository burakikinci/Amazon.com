package stepDefinitons;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.secondPage;
import util.DriverFactory;

public class SecondPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    secondPage secondPage = new secondPage(driver);

    @When("click accept cookies")
    public void clickAcceptCookies() {
        secondPage.clickCookies();
    }
    @When("Filter for {string}")
    public void filterFor(String filter) {
        secondPage.filteringDone();
    }


    @When("Go to the second page")
    public void goToTheSecondPage() {
        secondPage.changePage();
    }

    @When("Click the first {string}")
    public void clickTheFirst(String first) {
        secondPage.clickFirstProductofSecondPage(first);
    }


}
