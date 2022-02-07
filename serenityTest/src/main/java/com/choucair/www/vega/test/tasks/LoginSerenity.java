package com.choucair.www.vega.test.tasks;

import com.choucair.www.vega.test.models.PersonalData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.concurrent.TimeUnit;

import static com.choucair.www.vega.test.userinterfaces.HomePage.*;

public class LoginSerenity implements Task {

    private PersonalData personalData;

    public LoginSerenity(PersonalData personalDataInfo) {
        personalData = personalDataInfo;
    }

    public static LoginSerenity inputInfo(PersonalData info) {
        return Tasks.instrumented(LoginSerenity.class, info);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(personalData.getUser()).into(USER_LOGIN),
                Enter.theValue(personalData.getPassword()).into(PWRD_LOGIN),
                Click.on(CLK_LOGIN)
        );
    }
}
