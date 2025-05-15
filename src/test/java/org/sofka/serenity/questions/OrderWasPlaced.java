package org.sofka.serenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.sofka.serenity.ui.CheckoutPage;
import org.sofka.serenity.ui.ConfirmationPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OrderWasPlaced {
    public static Question<Boolean> successfully() {
        return new Question<Boolean>() {
            @Override
            public Boolean answeredBy(Actor actor) {

                actor.attemptsTo(
                    WaitUntil.the(ConfirmationPage.ORDER_CONFIRMATION_MESSAGE, isVisible())
                             .forNoMoreThan(10).seconds()
                );

                String confirmationText = Text.of(ConfirmationPage.ORDER_CONFIRMATION_MESSAGE)
                                              .answeredBy(actor)
                                              .toString();

                return confirmationText.contains("Your order has been placed!");
            }
        };
    }
}
