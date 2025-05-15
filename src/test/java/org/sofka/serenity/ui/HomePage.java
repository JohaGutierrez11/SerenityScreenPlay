package org.sofka.serenity.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target FIRST_PRODUCT = Target.the("first product")
            .located(By.xpath("(//div[@class='caption']//a)[1]"));

    public static final Target SECOND_PRODUCT = Target.the("second product")
            .located(By.cssSelector("//body//div[@id='common-home']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[3]//button[1]"));

    public static final Target VIEW_CART = Target.the("view cart button")
            .located(By.id("cart-total"));
}
