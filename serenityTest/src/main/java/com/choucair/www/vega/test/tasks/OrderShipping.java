package com.choucair.www.vega.test.tasks;

import com.choucair.www.vega.test.models.OrderShippingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import static com.choucair.www.vega.test.userinterfaces.OrdersPage.*;
import static com.choucair.www.vega.test.userinterfaces.ProductsPage.BTN_NORTHWIND_DROP;


public class OrderShipping implements Task {
    private OrderShippingData data;

    public OrderShipping(OrderShippingData data) {
        this.data = data;
    }

    public static OrderShipping createOrderWithShip(OrderShippingData data) {
        return Tasks.instrumented(OrderShipping.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String shipper=actor.recall("shipper");

        actor.attemptsTo(
                Click.on(CLICK_SHIPPING_PAGE),
                Click.on(CLICK_SHIP_VIA),
                Enter.theValue(data.getShipVia()).into(INPUT_SHIP_VIA),
                Hit.the(Keys.TAB).into(INPUT_SHIP_VIA),
                Enter.theValue(data.getShipName()).into(CLICK_SHIP_NAME),
                Enter.theValue(data.getShipCountry()).into(CLICK_SHIP_COUNTRY)
        );
actor.remember("companyName2",data.getShipVia());

    }
}
