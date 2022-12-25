package org.allegro.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver driver;

    @FindBy(css = "label[for = topFilter_allegro-smart-standard_1]")
    private WebElement smartFilterBtn;

    @FindBy(id = "multi-select-Allegro Smart!")
    private WebElement checkboxSmart;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void filterSmart() {
        smartFilterBtn.click();
    }

    public void checkCheckboxSmart() {
        Assert.assertTrue(checkboxSmart.isSelected());
    }
}
