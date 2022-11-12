package com.choucair.www.vega.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ValidatePage {
    public static final Target INPUT_MEETING_NAME = Target.the("input the name of business unit").locatedBy("(//*[@class='s-EditLink s-Pro-Meeting-MeetingLink' and contains(text(),'{0}')])[1]");
    public static final Target INPUT_SHIP_VIA = Target.the("input the TYPE OF SHIP").locatedBy("//div[text()='{0}']/following-sibling::div[contains(text(),' {1}')]");

    public static final Target INPUT_PRODUCT = Target.the("input the TYPE OF the product").locatedBy("(//a[contains(text(),'{0}')]/parent::div/following-sibling::div[text()='{1}'])[1]");
}
