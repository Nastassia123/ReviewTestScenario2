package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.smartcardio.Card;


public class MainPage extends BasePageClass {


    private String url = "https://stage.4frag.ru/";

   private By buyProductLocator = By.xpath("//a[text()='Купить']");

    private By closeButtonWindowLocator = By.xpath("//button[contains(@class, 'Test')]");

    private By cardButtonLocator = By.xpath("//span[text() = 'Корзина']");


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

    public MainPage closePopUpWindow() {
//gmail.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      /*  WebElement closeWindowButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(closeButtonWindowLocator));
        closeWindowButton.click();*/




     /* for (String winHandle: driver.getWindowHandles()) {
          driver.switchTo().window(winHandle);
          WebElement closeWindowButton = new WebDriverWait(driver, 10)
                  .until(ExpectedConditions.presenceOfElementLocated(closeButtonWindowLocator));
          closeWindowButton.click();
          */
        for (String winHandle: driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);}
      driver.findElement(cardButtonLocator).click();


        return this;
    }
    public CardPage goToTheCardPage() {



/*        for (String winHandle: driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
*/

        WebElement closeButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(cardButtonLocator));
        closeButton.click();
        return new CardPage();
    }


 /*   public CardPage verifyProductInTheCard(){
        WebElement cardButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(cardButtonLocator));
        cardButton.click();
      return new CardPage();
    }*/
}

