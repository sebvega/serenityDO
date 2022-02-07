package com.choucair.www.vega.test.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class MeetingPage {

    public static final Target BTN_MEETINGS_DROP = Target.the("click to meeting drop-down").locatedBy("//span[@class='s-sidebar-link-text' and text()='Meeting']");
    public static final Target BTN_MEETING = Target.the("click to meeting list").locatedBy("//span[@class='s-sidebar-link-text' and contains(text(),'Meetings')]");
    public static final Target BTN_NEW_MEETING = Target.the("click to new meeting settings").locatedBy("//*[@class='tool-button add-button icon-tool-button']");

    public static final Target INPUT_MEETING_NAME = Target.the("input the name of business unit").locatedBy("//*[contains(@id,'Serenity_Pro_Meeting_MeetingDialog') and contains(@id,'_MeetingName')]");
    public static final Target BTN_MEETING_TYPE = Target.the("click into select de meeting type to hard mode").locatedBy("//a[@class='inplace-button inplace-create edit']");
    public static final Target INPUT_MEETING_TYPE = Target.the("input the name of meetting type").locatedBy("//*[contains(@id,'Serenity_Pro_Meeting_MeetingTypeDialog') and contains(@id,'_Name')]");

    public static final Target BTN_SAVE_MEETING_2 = Target.the("save ").locatedBy("(//div[@class='button-outer']//parent::div[@class='tool-button save-and-close-button icon-tool-button'])[2]");
    public static final Target INPUT_MEETING_NUMBER = Target.the("input the meeting Number").locatedBy("//*[contains(@id,'Serenity_Pro_Meeting_MeetingDialog') and contains(@id,'_MeetingNumber')]");

    public static final Target INPUT_START_DATE = Target.the("input the start date").locatedBy("name:StartDate");
    public static final Target INPUT_END_DATE = Target.the("input the end date").locatedBy("name:EndDate");
    public static final Target SLK_HOUR = Target.the("select the hour").locatedBy("(//*[@class='editor s-DateTimeEditor time'])[1]");

    public static final Target BTN_IMPUT_INFO = Target.the("click on the location meeting").locatedBy("(//*[@class='inplace-button inplace-create'])[1]");
    public static final Target INPUT_NAME_LOCATION = Target.the("input the name of meeting location").locatedBy("//*[contains(@id,'Serenity_Pro_Meeting_MeetingLocationDialog') and contains(@id,'_Name')]");
    public static final Target INPUT_ADDRESS_LOCATION = Target.the("input the address of meeting location").locatedBy("//*[contains(@id,'Serenity_Pro_Meeting_MeetingLocationDialog') and contains(@id,'_Address')]");
    public static final Target INPUT_LATITUDE = Target.the("input the latitude of meeting location").locatedBy("//*[contains(@id,'Serenity_Pro_Meeting_MeetingLocationDialog') and contains(@id,'_Latitude')]");
    public static final Target INPUT_LONGITUDE = Target.the("input the longitude of meeting location").locatedBy("//*[contains(@id,'Serenity_Pro_Meeting_MeetingLocationDialog') and contains(@id,'_Longitude')]");

    public static final Target INPUT_NAME_UNIT = Target.the("input the name of business unit").locatedBy("//*[contains(@id,'Serenity_Pro_Organization_BusinessUnitDialog') and contains(@id,'_Name')]");

    public static final Target INPUT_TITLE = Target.the("input the title of organized").locatedBy("//*[contains(@id,'Serenity_Pro_Organization_ContactDialog') and contains(@id,'_Title')]");
    public static final Target INPUT_FIRST_NAME = Target.the("input the first name of organized").locatedBy("//*[contains(@id,'Serenity_Pro_Organization_ContactDialog') and contains(@id,'_FirstName')]");
    public static final Target INPUT_LAST_NAME = Target.the("input the last name of organized").locatedBy("//*[contains(@id,'Serenity_Pro_Organization_ContactDialog') and contains(@id,'_LastName')]");
    public static final Target INPUT_EMAIL = Target.the("input the email of organized").locatedBy("//*[contains(@id,'Serenity_Pro_Organization_ContactDialog') and contains(@id,'_Email')]");
    public static final Target INPUT_ID = Target.the("input the ID of organized").locatedBy("//*[contains(@id,'Serenity_Pro_Organization_ContactDialog') and contains(@id,'_IdentityNo')]");

    public static final Target BTN_SAVE_MEETING = Target.the("save the meet").locatedBy("(//div[@class='button-outer']//parent::div[@class='tool-button save-and-close-button icon-tool-button'])[1]");

    public static final Target BTN_UNIT_LOW = Target.the("add parent unit").locatedBy("//*[@class='s-TemplatedDialog ui-dialog-content ui-widget-content']//*[@class='select2-chosen']");
    public static final Target BTN_USER_LOW = Target.the("Add to user").locatedBy("//div[contains(@id,'select')]//div[contains(text(),'admin')]");
    public static final Target BTN_PARENT = Target.the("Add to user").locatedBy("//div[contains(@id,'select')]//div[contains(text(),'{0}')]");
}
