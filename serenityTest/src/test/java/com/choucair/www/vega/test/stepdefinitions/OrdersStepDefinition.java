package com.choucair.www.vega.test.stepdefinitions;

import com.choucair.www.vega.test.enums.MsgError;
import com.choucair.www.vega.test.exeptions.ExceptionError;
import com.choucair.www.vega.test.models.OrderShippingData;
import com.choucair.www.vega.test.questions.GetText;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

import static com.choucair.www.vega.test.tasks.OrderShipping.createOrderWithShip;
import static com.choucair.www.vega.test.tasks.Orders.orderShipping;
import static com.choucair.www.vega.test.tasks.Product.inputInfo;
import static com.choucair.www.vega.test.tasks.SaveOrder.saveOrder;
import static com.choucair.www.vega.test.tasks.Shippers.shipper;
import static com.choucair.www.vega.test.userinterfaces.ValidatePage.INPUT_PRODUCT;
import static com.choucair.www.vega.test.userinterfaces.ValidatePage.INPUT_SHIP_VIA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class OrdersStepDefinition {
    @When("added new product")
    public void addedNewProduct(Map<String, String> data) {
        theActorInTheSpotlight().attemptsTo(inputInfo(data));
    }

    @When("create new order")
    public void createNewOrder(OrderShippingData data) {
        theActorInTheSpotlight().attemptsTo(orderShipping(data), saveOrder());
    }

    @Then("check the order status {string}")
    public void checkTheOrderStatus(String string) {
        String requireDate = OnStage.theActorInTheSpotlight().recall("RequireDate");
        String customer = OnStage.theActorInTheSpotlight().recall("Customer");
        theActorInTheSpotlight().should(seeThat(GetText.field(INPUT_PRODUCT.of(customer,requireDate)), equalTo(requireDate))
                .orComplainWith(ExceptionError.class, String.format(MsgError.MSG_ERROR_TEXT.getMsg(), requireDate,
                        GetText.field(INPUT_PRODUCT.of(customer,requireDate)).answeredBy(theActorInTheSpotlight()))));
    }

    @When("added new shipper")
    public void addedNewShipper(Map<String, String> data) {
        theActorInTheSpotlight().attemptsTo(shipper(data));
    }

    @When("create new order with shipper")
    public void createNewOrderWithShipper(OrderShippingData dataShipping) {
        theActorInTheSpotlight().attemptsTo(orderShipping(dataShipping), createOrderWithShip(dataShipping), saveOrder());
    }

    @Then("check the  status {string}")
    public void checkTheStatus(String string) {
        String companyName = OnStage.theActorInTheSpotlight().recall("companyName2");
        String requireDate = OnStage.theActorInTheSpotlight().recall("RequireDate");
        theActorInTheSpotlight().should(seeThat(GetText.field(INPUT_SHIP_VIA.of(requireDate, companyName)), equalTo(companyName))
                .orComplainWith(ExceptionError.class, String.format(MsgError.MSG_ERROR_TEXT.getMsg(), companyName,
                        GetText.field(INPUT_SHIP_VIA.of(requireDate, companyName)).answeredBy(theActorInTheSpotlight()))));
    }
}
