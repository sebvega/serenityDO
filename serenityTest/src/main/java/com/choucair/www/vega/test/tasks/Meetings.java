package com.choucair.www.vega.test.tasks;

import com.choucair.www.vega.test.interactions.DropDown;
import com.choucair.www.vega.test.interactions.User;
import com.choucair.www.vega.test.models.MeetingData;
import com.choucair.www.vega.test.userinterfaces.MeetingPage;
import com.choucair.www.vega.test.userinterfaces.ValidatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import static com.choucair.www.vega.test.userinterfaces.BusinessPage.BTN_ORGANIZATION;
import static com.choucair.www.vega.test.userinterfaces.MeetingPage.*;

public class Meetings implements Task {

    private MeetingData meetingData;

    public Meetings(MeetingData meetingDataInfo) {
        meetingData = meetingDataInfo;
    }

    public static Meetings inputInfo(MeetingData info) {
        return Tasks.instrumented(Meetings.class, info);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String nameBusiness = actor.recall("nameBusiness").toString();
        actor.attemptsTo(
                Click.on(BTN_MEETINGS_DROP),
                Click.on(BTN_MEETING),
                Click.on(BTN_NEW_MEETING),
                Enter.theValue(meetingData.getNameBussinesUnit()).into(INPUT_MEETING_NAME),

                Click.on(BTN_MEETING_TYPE),
                Enter.theValue(meetingData.getMeetingName()).into(INPUT_MEETING_TYPE),
                Click.on(BTN_SAVE_MEETING_2),

                Enter.theValue(meetingData.getMeetingNumber()).into(INPUT_MEETING_NUMBER),
                Enter.theValue(meetingData.getStarDate()).into(INPUT_START_DATE),
                SelectFromOptions.byValue(meetingData.getHourStar()).from(SLK_HOUR),
                Enter.theValue(meetingData.getEndDate()).into(INPUT_END_DATE),
                SelectFromOptions.byValue(meetingData.getHourEnd()).from(SLK_HOUR),

                Click.on(MeetingPage.BTN_IMPUT_INFO),
                Enter.theValue(meetingData.getNameLocation()).into(INPUT_NAME_LOCATION),
                Enter.theValue(meetingData.getAddresLocation()).into(INPUT_ADDRESS_LOCATION),
                Enter.theValue(meetingData.getLatitudeLocation()).into(INPUT_LATITUDE),
                Enter.theValue(meetingData.getLongitudeLocation()).into(INPUT_LONGITUDE),
                Click.on(BTN_SAVE_MEETING_2),

                Click.on(MeetingPage.BTN_IMPUT_INFO),
                Enter.theValue(meetingData.getUnit()).into(INPUT_NAME_UNIT),
                Click.on(BTN_UNIT_LOW),
                Click.on(BTN_PARENT.of(nameBusiness)),
                Click.on(BTN_SAVE_MEETING_2),

                Click.on(BTN_IMPUT_INFO),
                User.location(meetingData),
                DropDown.toElement(BTN_UNIT_LOW, BTN_USER_LOW),
                Click.on(BTN_SAVE_MEETING_2),

                Click.on(BTN_IMPUT_INFO),
                User.location(meetingData),
                DropDown.toElement(BTN_UNIT_LOW, BTN_USER_LOW),
                Click.on(BTN_SAVE_MEETING_2),

                Click.on(BTN_IMPUT_INFO),
                User.location(meetingData),
                DropDown.toElement(BTN_UNIT_LOW, BTN_USER_LOW),
                Click.on(BTN_SAVE_MEETING_2),


                Click.on(BTN_SAVE_MEETING)
        );
        actor.remember("MEETINGNAME", meetingData.getNameBussinesUnit());
    }
}
