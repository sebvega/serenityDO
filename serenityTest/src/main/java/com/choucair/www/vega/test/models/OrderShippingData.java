package com.choucair.www.vega.test.models;

public class OrderShippingData {
    private String customer;
    private String orderDate;
    private String requiredDate;
    private String employee;
    private String product;
    private String unitPrice;
    private String quantity;
    private String discount;
    private String shipVia;
    private String shipName;
    private String shipCountry;

    public OrderShippingData(String customer, String orderDate, String requiredDate, String employee, String product, String unitPrice, String quantity, String discount, String shipVia, String shipName, String shipCountry) {
        this.customer = customer;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.employee = employee;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.shipVia = shipVia;
        this.shipName = shipName;
        this.shipCountry = shipCountry;
    }

    public String getCustomer() {
        return customer;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProduct() {
        return product;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getDiscount() {
        return discount;
    }

    public String getShipVia() {
        return shipVia;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipCountry() {
        return shipCountry;
    }
}
