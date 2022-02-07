package com.choucair.www.vega.test.tasks;

import io.cucumber.datatable.DataTable;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.util.Map;

import static com.choucair.www.vega.test.userinterfaces.BusinessPage.*;

public class BusinessUnits implements Task {


    private Map<String,String> info;

    public BusinessUnits(Map<String,String> data) {
        this.info = data;
    }

    public static BusinessUnits Business(Map<String,String> data){
            return Tasks.instrumented(BusinessUnits.class,data);
        }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(BTN_ORGANIZATION),WebElementStateMatchers.isClickable()).forNoLongerThan(25).seconds(),
                Click.on(BTN_ORGANIZATION),
                Click.on(BTN_BUSINESS_UNITS),
                Click.on(BTN_NEW_BUSINESS));
        actor.attemptsTo(
                Enter.theValue(info.get("nameBusiness")).into(INPUT_NAME_BUSINESS),
                Click.on(BTN_SAVE_BUSINESS)
        );
        actor.remember("nameBusiness",info.get("nameBusiness"));

    }
}
