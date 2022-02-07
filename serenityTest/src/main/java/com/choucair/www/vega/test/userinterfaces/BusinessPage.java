package com.choucair.www.vega.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusinessPage {

    public static final Target BTN_ORGANIZATION = Target.the("click to organitation drop-down").locatedBy("//span[@class='s-sidebar-link-text' and contains(text(),'Organi')]");
    public static final Target BTN_BUSINESS_UNITS = Target.the("click to organitation list").locatedBy("//span[@class='s-sidebar-link-text' and contains(text(),'Business')]");
    public static final Target BTN_NEW_BUSINESS = Target.the("enter the user").locatedBy("//div[@class='tool-button add-button icon-tool-button']");
    public static final Target INPUT_NAME_BUSINESS = Target.the("input the name of business unit").locatedBy("name:Name");
    public static final Target BTN_SAVE_BUSINESS = Target.the("click into save th business unit").locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");

}
