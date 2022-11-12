package com.choucair.www.vega.test.hooks;

import com.choucair.www.vega.test.models.OrderShippingData;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableOrderShipping {
    @DataTableType
    public OrderShippingData transformToOrderShippingData(Map<String, String> data) {
        return new OrderShippingData(
                data.get("customer"),
                data.get("orderDate"),
                data.get("requiredDate"),
                data.get("employee"),
                data.get("product"),
                data.get("unitPrice"),
                data.get("quantity"),
                data.get("discount"),
                data.get("shipVia"),
                data.get("shipName"),
                data.get("shipCountry")
        );
    }
}
