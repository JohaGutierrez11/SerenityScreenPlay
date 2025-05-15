package org.sofka.serenity.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;


public class OpenThePage {

    public static Task browser(){
        return Task.where("{0} opens the OpenCart home page", Open.url("http://opencart.abstracta.us/"));
    }
}
