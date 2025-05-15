package org.sofka.serenity.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.sofka.serenity.ui.HomePage;

public class ViewCart {

    public static Task now(){
        return Task.where("{0} views the cart",
                Click.on(HomePage.VIEW_CART));
    }
}
