package com.choucair.www.vega.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ValidatePage {
    public static final Target INPUT_MEETING_NAME = Target.the("input the name of business unit").locatedBy("(//*[@class='s-EditLink s-Pro-Meeting-MeetingLink' and contains(text(),'{0}')])[1]");

}
