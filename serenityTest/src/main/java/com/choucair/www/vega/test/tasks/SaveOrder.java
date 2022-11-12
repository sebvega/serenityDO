package com.choucair.www.vega.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.www.vega.test.userinterfaces.OrdersPage.CLK_SAVE_ORDER;

public class SaveOrder implements Task {
    
    public static SaveOrder saveOrder() {
        return Tasks.instrumented(SaveOrder.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CLK_SAVE_ORDER)
        );
    }
}
