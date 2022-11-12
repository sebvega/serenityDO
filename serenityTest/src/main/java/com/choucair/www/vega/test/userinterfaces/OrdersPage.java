package com.choucair.www.vega.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OrdersPage {
    public static final Target SLT_ORDERS = Target.the("select the orders page").locatedBy("(//*[contains(@class,'s-sidebar-link-text') and contains(text(),'Orders')])[1]");
    public static final Target BTN_NEW_ORDER = Target.the("Click to new Order").locatedBy("(//div[contains(@class,'tool-button add-button icon-tool-button')])");
    public static final Target SLT_CUSTOMER = Target.the("click in customer").locatedBy("id:select2-chosen-8");
    public static final Target SLT_CUSTOMER_LIST = Target.the("select the customer page").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target SLT_ORDER_DATE = Target.the("input order date").locatedBy("name:OrderDate");
    public static final Target SLT_REQUIRED_DATE = Target.the("input required date").locatedBy("name:RequiredDate");
    public static final Target SLT_EMPLOYEE_LIST = Target.the("select list of employee").locatedBy("id:select2-chosen-9");
    public static final Target SLT_EMPLOYEE = Target.the("select list of employee").locatedBy("//div[contains(text(),'{0}') and @class='select2-result-label']");
    public static final Target CLICK_NEW_DETAIL = Target.the("select one employee").locatedBy("(//div[@class='tool-button add-button icon-tool-button'])[2]");
    public static final Target CLICK_PRODUCTS_LIST = Target.the("select table of the products").locatedBy("//*[contains(@id,'select2-chosen-') and contains(text(),'select--')]//parent::a//parent::div[contains(@id,'s2id_Serenity_Demo_Northwind_OrderDetailDialog')]");
    public static final Target SLK_PRODUCT = Target.the("input required date").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target ENTER_PRICE = Target.the("input unit price").locatedBy("name:UnitPrice");
    public static final Target ENTER_QUANTITY = Target.the("input quiantity").locatedBy("name:Quantity");
    public static final Target ENTER_DISCOUNT = Target.the("input discount").locatedBy("name:Discount");
    public static final Target CLK_SAVE = Target.the("click on save new order detail").locatedBy("(//div[contains(@class,'tool-button save-and-close-button icon-tool-button')])[2]");
    public static final Target CLICK_SHIPPING_PAGE = Target.the("user bottom to change page to shipping").locatedBy("//a[contains(@class,'nav-link') and contains(text(),'Shipping')]");
    public static final Target INPUT_SHIP_VIA = Target.the("click on shipVia").locatedBy("//label[contains(text(),'Ship Via')]/following-sibling::input[@class='select2-input select2-focused']");
    public static final Target CLICK_SHIP_VIA = Target.the("click on shipVia").locatedBy("//*[contains(@id,'s2id_Serenity_Demo_Northwind_OrderDialog') and contains(@id,'_ShipVia')]");
    public static final Target CLICK_SHIP_NAME = Target.the("write ship name").locatedBy("name:ShipName");
    public static final Target CLICK_SHIP_COUNTRY = Target.the("write ship country").locatedBy("name:ShipCountry");
    public static final Target CLK_SAVE_ORDER = Target.the("click in save new order").locatedBy("//div[contains(@class,'tool-button save-and-close-button icon-tool-button')]");

}
