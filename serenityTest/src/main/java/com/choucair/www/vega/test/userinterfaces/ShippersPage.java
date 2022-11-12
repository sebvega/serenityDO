package com.choucair.www.vega.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShippersPage {
    public static final Target BTN_SHIPPERS_COMP = Target.the("click to shippers").locatedBy("(//*[contains(@class,'s-sidebar-link-text') and contains(text(),'Shippers')])[1]");
    public static final Target BTN_NEW_SHIPPER = Target.the("click to new shipper").locatedBy("(//div[contains(@class,'tool-button add-button icon-tool-button')])");
    public static final Target INPUT_COMPANY = Target.the("click to add company name").locatedBy("name:CompanyName");
    public static final Target INPUT_PHONE = Target.the("click to add phone").locatedBy("name:Phone");
    public static final Target CLICK_SAVE = Target.the("click to save").locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");

}
