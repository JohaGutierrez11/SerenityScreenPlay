package org.sofka.serenity.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.sofka.serenity.ui.*;

public class AddSecondProduct {
    public static Task toCart() {
        return Task.where("{0} adds second product to cart",
                Click.on(TabletPage.TABLET_SECTION),
                Click.on(TabletPage.SECOND_PRODUCT),
                Click.on(ProductPage.ADD_TO_CART)
        );
    }
}
