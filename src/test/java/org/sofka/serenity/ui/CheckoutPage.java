package org.sofka.serenity.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

     public static final Target CHECKOUT_BUTTON = Target.the("checkout button")
            .located(By.linkText("Checkout"));

    public static final Target GUEST_CHECKOUT_OPTION = Target.the("guest checkout option")
            .located(By.xpath("//input[@value='guest']"));

    public static final Target CONTINUE_BUTTON = Target.the("continue button")
            .located(By.id("button-account"));

    public static final Target FIRST_NAME = Target.the("first name").located(By.id("input-payment-firstname"));
    public static final Target LAST_NAME = Target.the("last name").located(By.id("input-payment-lastname"));
    public static final Target EMAIL = Target.the("email").located(By.id("input-payment-email"));
    public static final Target TELEPHONE = Target.the("telephone").located(By.id("input-payment-telephone"));
    public static final Target ADDRESS = Target.the("address").located(By.id("input-payment-address-1"));
    public static final Target CITY = Target.the("city").located(By.id("input-payment-city"));
    public static final Target POSTCODE = Target.the("postcode").located(By.id("input-payment-postcode"));

    public static final Target COUNTRY = Target.the("country dropdown").located(By.id("input-payment-country"));
    public static final Target SELECT_COUNTRY = Target.the("select Ecuador")
            .located(By.xpath("//select[@id='input-payment-country']/option[text()='Ecuador']"));

    public static final Target STATE = Target.the("state dropdown").located(By.id("input-payment-zone"));
    public static final Target SELECT_STATE = Target.the("select Pichincha")
            .located(By.xpath("//select[@id='input-payment-zone']/option[contains(text(),'Pichincha')]"));

    public static final Target CONTINUE_GUEST = Target.the("continue guest").located(By.id("button-guest"));
    public static final Target CONTINUE_DELIVERY = Target.the("continue delivery method").located(By.id("button-shipping-method"));

    public static final Target AGREE_TERMS = Target.the("agree to terms").located(By.name("agree"));
    public static final Target CONTINUE_PAYMENT = Target.the("continue payment method").located(By.id("button-payment-method"));
    public static final Target CONFIRM_ORDER = Target.the("confirm order").located(By.id("button-confirm"));


}
