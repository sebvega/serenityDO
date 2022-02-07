package com.choucair.www.vega.test.stepdefinitions;

import com.choucair.www.vega.test.enums.MsgError;
import com.choucair.www.vega.test.exeptions.ExceptionError;
import com.choucair.www.vega.test.models.MeetingData;
import com.choucair.www.vega.test.models.PersonalData;
import com.choucair.www.vega.test.questions.GetText;
import com.choucair.www.vega.test.tasks.LoginSerenity;
import com.choucair.www.vega.test.userinterfaces.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static com.choucair.www.vega.test.tasks.BusinessUnits.Business;
import static com.choucair.www.vega.test.tasks.Meetings.inputInfo;
import static com.choucair.www.vega.test.userinterfaces.ValidatePage.INPUT_MEETING_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class MeetingStepDefinition {

    @Before
    public void initialConfig() {
        setTheStage(new OnlineCast());
    }

    @Given("^(.*) starts session$")
    public void startsSession(String name, PersonalData info) {
        theActorCalled(name).wasAbleTo(Open.browserOn(new HomePage()), LoginSerenity.inputInfo(info));
    }

    @When("added business unit")
    public void addedbusinessunit(Map<String, String> data) {
        theActorInTheSpotlight().attemptsTo(Business(data));
    }

    @When("configured meeting")
    public void configuredMeeting(MeetingData data) {
        theActorInTheSpotlight().attemptsTo(inputInfo(data));
    }

    @Then("check the status {string}")
    public void checkTheStatus(String string) {
        String meetingName = OnStage.theActorInTheSpotlight().recall("MEETINGNAME");
        theActorInTheSpotlight().should(seeThat(GetText.field(INPUT_MEETING_NAME.of(meetingName)), equalTo(meetingName))
                .orComplainWith(ExceptionError.class, String.format(MsgError.MSG_ERROR_TEXT.getMsg(), meetingName,
                        GetText.field(INPUT_MEETING_NAME.of(meetingName)).answeredBy(theActorInTheSpotlight()))));
    }
}
