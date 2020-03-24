package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class MainPage extends BasePageClass {


    private String url = "https://stage.4frag.ru/";

   private By buyProductLocator = By.linkText("Купить");

    private By closeButtonWindowLocator = By.className("close");

    private By cardButtonLocator = By.xpath("span[text() = 'Корзина']");


    public MainPage openHomePage() {
        open(url);
        return this;
    }


    public MainPage addProductToCard() {
        WebElement buyButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(buyProductLocator));
        buyButton.click();
        return this;
    }

    public MainPage closeAddToCardWindow() {
        WebElement closeButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(closeButtonWindowLocator));
        closeButton.click();
        return this;
    }

    public CardPage verifyProductInTheCard(){
        WebElement cardButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(cardButtonLocator));
        cardButton.click();
      return new CardPage();
    }
}

