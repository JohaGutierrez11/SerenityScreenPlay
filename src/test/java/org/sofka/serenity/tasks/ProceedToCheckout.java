package org.sofka.serenity.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.sofka.serenity.ui.CheckoutPage;

public class ProceedToCheckout {
    public static Task asGuest(){
        return Task.where("{0} proceeds to checkout as guest",
                Click.on(CheckoutPage.CHECKOUT_BUTTON),
                Click.on(CheckoutPage.GUEST_CHECKOUT_OPTION),
                Click.on(CheckoutPage.CONTINUE_BUTTON),
                Enter.theValue("Johanna").into(CheckoutPage.FIRST_NAME),
                Enter.theValue("Gutierrez").into(CheckoutPage.LAST_NAME),
                Enter.theValue("joha.gtabango.13@gmail.com").into(CheckoutPage.EMAIL),
                Enter.theValue("0995397006").into(CheckoutPage.TELEPHONE),
                Enter.theValue("Jorge Carvajal").into(CheckoutPage.ADDRESS),
                Enter.theValue("Quito").into(CheckoutPage.CITY),
                Enter.theValue("170201").into(CheckoutPage.POSTCODE),
                Click.on(CheckoutPage.COUNTRY),
                Click.on(CheckoutPage.SELECT_COUNTRY),
                Click.on(CheckoutPage.STATE),
                Click.on(CheckoutPage.SELECT_STATE),
                Click.on(CheckoutPage.CONTINUE_GUEST),
                Click.on(CheckoutPage.CONTINUE_DELIVERY),
                Click.on(CheckoutPage.AGREE_TERMS),
                Click.on(CheckoutPage.CONTINUE_PAYMENT),
                Click.on(CheckoutPage.CONFIRM_ORDER)
                );
    }
}
