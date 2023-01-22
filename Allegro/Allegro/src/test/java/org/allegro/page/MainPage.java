package org.allegro.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {

    private WebDriver driver;

    @FindBy(css = "button[data-role = accept-consent]")
    private WebElement acceptBtn;

    @FindBy(css = "input[placeholder=\"czego szukasz?\"]")
    private WebElement searchTextBox;

    @FindBy(css = "button[data-role = search-button]")
    private  WebElement searchButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookie() {
        acceptBtn.click();
    }

    public void searchByText() {
        searchTextBox.clear();
        searchTextBox.sendKeys("Koszula");
        searchButton.click();
    }

    @FindBy(css = "a[data-role=\"multisearch-button\"]")
    private WebElement btnMultipleSearch;

    public void multipleSearch() {
        btnMultipleSearch.click();
    }
}
