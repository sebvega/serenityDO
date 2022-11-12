package com.choucair.www.vega.test.hooks;

import com.choucair.www.vega.test.models.OrdersData;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableOrders {
    @DataTableType
    public OrdersData transformToOrdersData(Map<String, String> data) {
        return new OrdersData(
                data.get("customer"),
                data.get("orderDate"),
                data.get("requiredDate"),
                data.get("employee"),
                data.get("product"),
                data.get("unitPrice"),
                data.get("quantity"),
                data.get("discount")
        );
    }
}
