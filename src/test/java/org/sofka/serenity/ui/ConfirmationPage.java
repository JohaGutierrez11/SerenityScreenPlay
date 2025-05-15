package org.sofka.serenity.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmationPage {
     public static final Target ORDER_CONFIRMATION_MESSAGE = Target.the("order confirmation message")
            .located(By.xpath("//h1[normalize-space()='Your order has been placed!']"));
}
