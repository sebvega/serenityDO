package com.choucair.www.vega.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.util.Map;

import static com.choucair.www.vega.test.userinterfaces.ProductsPage.BTN_NORTHWIND_DROP;
import static com.choucair.www.vega.test.userinterfaces.ShippersPage.*;

public class Shippers implements Task {
    private Map<String, String> data;

    public Shippers(Map<String, String> data) {
        this.data = data;
    }

    public static Shippers shipper(Map<String, String> data) {
        return Tasks.instrumented(Shippers.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(BTN_NORTHWIND_DROP), WebElementStateMatchers.isClickable()).forNoLongerThan(25).seconds(),
                Click.on(BTN_NORTHWIND_DROP),
                Click.on(BTN_SHIPPERS_COMP),
                Click.on(BTN_NEW_SHIPPER),
                Enter.theValue(data.get("companyName")).into(INPUT_COMPANY),
                Enter.theValue(data.get("phone")).into(INPUT_PHONE),
                Click.on(CLICK_SAVE)

        );
        actor.remember("shipper", data.get("companyName"));
    }
}
