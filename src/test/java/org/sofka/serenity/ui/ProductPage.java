package org.sofka.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
      public static final Target ADD_TO_CART = Target.the("Add to cart button")
            .located(By.id("button-cart"));
      public static final Target TABLET = Target.the("Go back to home")
              .located(By.xpath("//a[normalize-space()='Tablets']"));
}
