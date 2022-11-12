package com.choucair.www.vega.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.util.Map;

import static com.choucair.www.vega.test.userinterfaces.ProductsPage.*;

public class Product implements Task {
    private Map<String,String> data;

    public Product(Map<String,String> data) {
        this.data = data;
    }

    public static Product inputInfo(Map<String,String> data){
        return Tasks.instrumented(Product.class,data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(BTN_NORTHWIND_DROP),WebElementStateMatchers.isClickable()).forNoLongerThan(25).seconds(),
                Click.on(BTN_NORTHWIND_DROP),
                Click.on(BTN_PRODUCTS_COMP),
                Click.on(BTN_NEW_PRODUCT),
                Enter.theValue(data.get("productName")).into(INPUT_PRODUCT_NAME),
                Click.on(DISPLAY_SUPLIER),
                Click.on(SELECT_SUPLIER.of(data.get("supplier"))),
                Click.on(DISPLAY_CATEGORY),
                Click.on(SELECT_CATEGORY.of(data.get("categoty"))),
                Enter.theValue(data.get("quantityPerUnit")).into(INPUT_QUANTITY),
                Enter.theValue(data.get("unitPrice")).into(INPUT_PRICE),
                Enter.theValue(data.get("unitsInStock")).into(INPUT_STOCK),
                Enter.theValue(data.get("unitsOnOrder")).into(INPUT_ORDER),
                Enter.theValue(data.get("reorderLevel")).into(INPUT_REORDER),
                Scroll.to(CLICK_SAVE),
                Click.on(CLICK_SAVE)
        );
        actor.remember("product",data.get("productName"));
    }
}
