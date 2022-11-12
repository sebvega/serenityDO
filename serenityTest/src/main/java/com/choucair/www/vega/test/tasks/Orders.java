package com.choucair.www.vega.test.tasks;

import com.choucair.www.vega.test.models.OrderShippingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucair.www.vega.test.userinterfaces.OrdersPage.*;

public class Orders implements Task {

    private OrderShippingData data;

    public Orders(OrderShippingData data) {
        this.data = data;
    }

    public static Orders orderShipping(OrderShippingData data) {
        return Tasks.instrumented(Orders.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String product = actor.recall("product");
        actor.attemptsTo(Click.on(SLT_ORDERS),
                Click.on(BTN_NEW_ORDER),
                Click.on(SLT_CUSTOMER),
                Click.on(SLT_CUSTOMER_LIST.of(data.getCustomer())));
        actor.attemptsTo(
                Enter.theValue(data.getOrderDate()).into(SLT_ORDER_DATE),
                Enter.theValue(data.getRequiredDate()).into(SLT_REQUIRED_DATE),
                Click.on(SLT_EMPLOYEE_LIST),
                Click.on(SLT_EMPLOYEE.of(data.getEmployee())),
                Click.on(CLICK_NEW_DETAIL),
                Click.on(CLICK_PRODUCTS_LIST),

                Click.on(SLK_PRODUCT.of(data.getProduct())),

                Enter.theValue(data.getUnitPrice()).into(ENTER_PRICE),
                Enter.theValue(data.getQuantity()).into(ENTER_QUANTITY),
                Enter.theValue(data.getDiscount()).into(ENTER_DISCOUNT),
                Click.on(CLK_SAVE)
        );
        actor.remember("RequireDate",data.getRequiredDate());
        actor.remember("Customer",data.getCustomer());
        actor.remember("producto2",data.getProduct());
    }
}
