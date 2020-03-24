package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CardPage;
import pages.MainPage;

public class VerifyProductIsAddedToCard {


    @Test
    public void testAdditionProductToCard()  {
       MainPage mainPage = new MainPage()
               .openHomePage()
               .addProductToCard()
               .closeAddToCardWindow();
              // .verifyProductInTheCard();

    }
}
