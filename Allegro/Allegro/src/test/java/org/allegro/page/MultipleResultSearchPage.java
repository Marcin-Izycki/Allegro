package org.allegro.page;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MultipleResultSearchPage {
    private WebDriver driver;
    public MultipleResultSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "sort")
    WebElement filter;
    @FindBy(css = "div.mpof_ki  div.mj7a_4")
    WebElement textFirstItem;
    public void selectFilterOnHighestAccuracy() {
        Select select = new Select(filter);
        select.selectByValue("m");
    }

    public void checkProduct(String firstItem) {
        String actualText;
        actualText = textFirstItem.getText();
        Assert.assertTrue(firstItem, actualText.contains(firstItem));
    }
}
