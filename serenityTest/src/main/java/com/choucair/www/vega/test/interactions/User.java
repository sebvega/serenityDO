package com.choucair.www.vega.test.interactions;

import com.choucair.www.vega.test.models.MeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.choucair.www.vega.test.userinterfaces.MeetingPage.*;

public class User implements Interaction {

    MeetingData meetingData;

    public User(MeetingData meetingData) {
        this.meetingData = meetingData;
    }

    public static User location(MeetingData meetingData) {
        return Tasks.instrumented(User.class, meetingData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(meetingData.getContacTitle()).into(INPUT_TITLE),
                Enter.theValue(meetingData.getContactFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(meetingData.getContactLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(meetingData.getContactEmail()).into(INPUT_EMAIL),
                Enter.theValue(meetingData.getContactId()).into(INPUT_ID)
        );
    }
}
