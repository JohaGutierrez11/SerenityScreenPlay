package org.sofka.serenity.features;

import io.cucumber.java.en.Given;
import io.cucumber.java.pl.Gdy;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.sofka.serenity.tasks.*;
import org.sofka.serenity.questions.OrderWasPlaced;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class PurchaseE2ETest {

    @Managed(driver = "chrome")
    public WebDriver herDriver;

    private Actor buyer = Actor.named("Joha");

    @Before
    public void Setup(){
        WebDriverManager.chromedriver().driverVersion("136.0.7103.114").setup();
        buyer.can(BrowseTheWeb.with(herDriver));
    }

    @Test
    public void userShouldBeAbleToBuyProductsAsGuest(){
        givenThat(buyer).wasAbleTo(
                OpenThePage.browser(),
                AddFirstProduct.toCart(),
                GoTabletPage.toTabletPage(),
                AddSecondProduct.toCart(),
                ViewCart.now(),
                ProceedToCheckout.asGuest()
        );

        then(buyer).should(seeThat(OrderWasPlaced.successfully()));
    }
}
