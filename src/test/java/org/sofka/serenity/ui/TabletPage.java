package org.sofka.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TabletPage {
    public static final Target TABLET_SECTION = Target.the("Tablet Section")
            .located(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Tablets')]"));
    public static final Target SECOND_PRODUCT = Target.the("second product")
            .located(By.xpath("//a[normalize-space()='Samsung Galaxy Tab 10.1']"));
}
