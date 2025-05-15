package org.sofka.serenity.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.sofka.serenity.ui.*;

public class AddFirstProduct {

    public static Task toCart(){
        return Task.where("{0} adds first product to cart",
                Click.on(HomePage.FIRST_PRODUCT),
                Click.on(ProductPage.ADD_TO_CART));

    }
}


