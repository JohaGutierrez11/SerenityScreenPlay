package org.sofka.serenity.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.sofka.serenity.ui.ProductPage;

public class GoTabletPage {
    public static Task toTabletPage() {
        return Task.where("{0} goes back to home page",
                Click.on(ProductPage.TABLET));
    }
}
