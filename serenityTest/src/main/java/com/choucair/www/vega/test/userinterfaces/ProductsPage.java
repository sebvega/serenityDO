package com.choucair.www.vega.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {
    public static final Target BTN_NORTHWIND_DROP = Target.the("click to NORTHWIND drop-down").locatedBy("//*[contains(@class,'s-sidebar-link-text') and contains(text(),'Northwind')]");
    public static final Target BTN_PRODUCTS_COMP = Target.the("click to products").locatedBy("(//*[contains(@class,'s-sidebar-link-text') and contains(text(),'Products')])[1]");
    public static final Target BTN_NEW_PRODUCT = Target.the("click to new product").locatedBy("(//div[contains(@class,'tool-button add-button icon-tool-button')])");
    public static final Target INPUT_PRODUCT_NAME = Target.the("input product name").locatedBy("id:Serenity_Demo_Northwind_ProductDialog9_ProductName");
    public static final Target DISPLAY_SUPLIER = Target.the("click to supplier drop-down").locatedBy("(//a[contains(@class,'select2-choice select2-default')])[3]");
    public static final Target SELECT_SUPLIER = Target.the("click to supplier").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target DISPLAY_CATEGORY = Target.the("click to category drop-down").locatedBy("id:select2-chosen-5");
    public static final Target SELECT_CATEGORY = Target.the("click to category").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target INPUT_QUANTITY = Target.the("input Quantity Per Unit").locatedBy("name:QuantityPerUnit");
    public static final Target INPUT_PRICE = Target.the("input Unit Price").locatedBy("name:UnitPrice");
    public static final Target INPUT_STOCK = Target.the("input Units In Stock").locatedBy("name:UnitsInStock");
    public static final Target INPUT_ORDER = Target.the("input Units On Order").locatedBy("name:UnitsOnOrder");
    public static final Target INPUT_REORDER = Target.the("input Reorder Level").locatedBy("name:ReorderLevel");
    public static final Target CLICK_SAVE = Target.the("click to save").locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");
}
