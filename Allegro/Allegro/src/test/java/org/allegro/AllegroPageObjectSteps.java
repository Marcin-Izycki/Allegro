package org.allegro;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.allegro.page.MainPage;
import org.allegro.page.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class AllegroPageObjectSteps {
    private WebDriver driver;

    @Given("on open browser with allegro.pl")
    public void openAllegroMainPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://allegro.pl/");

        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookie();
    }

    @When("user search product named koszula")
    public void searchProductNamed() {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchByText();
    }

    @Then("user select in filter Allegro Smart")
    public void filterSelect() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.filterSmart();
    }

    @And("checkbox with Allegro Smart is selected")
    public void checkboxSelectedChecked() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.checkCheckboxSmart();
    }

    @And("Close browser")
    public void closeBrowser() {
        //MainPage mainPage = new MainPage(driver);
        driver.quit();
    }
}
