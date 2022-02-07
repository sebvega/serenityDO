package com.choucair.www.vega.test.userinterfaces;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://serenity.is/demo/")
public class HomePage extends PageObject {
    public static final Target USER_LOGIN=Target.the("input the user").locatedBy("id:StartSharp_Membership_LoginPanel0_Username");
    public static final Target PWRD_LOGIN=Target.the("input the password").locatedBy("id:StartSharp_Membership_LoginPanel0_Password");
    public static final Target CLK_LOGIN=Target.the("click to continue the login").locatedBy("id:StartSharp_Membership_LoginPanel0_LoginButton");
}
