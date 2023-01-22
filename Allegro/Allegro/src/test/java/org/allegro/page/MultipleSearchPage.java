package org.allegro.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleSearchPage {
    private WebDriver driver;



    @FindBy(id = "input0")
    private WebElement inputFirst;
    @FindBy(id = "input1")
    private WebElement inputSecond;
    @FindBy(css = "div.mp4t_16 button[type = submit]")
    private WebElement searchBtn;
    public MultipleSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setNameProducts(String firstItem, String secondItem) {
        inputFirst.sendKeys(firstItem);
        inputSecond.sendKeys(secondItem + Keys.ENTER);
    }
}
