package com.example.datasqltask3.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Orders {
    private int id;
    private Date date;
    private int customerId;
    private String productName;
    private BigDecimal decimal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return id == orders.id && customerId == orders.customerId && Objects.equals(date, orders.date) && Objects.equals(productName, orders.productName) && Objects.equals(decimal, orders.decimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, customerId, productName, decimal);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", date=" + date +
                ", customerId=" + customerId +
                ", productName='" + productName + '\'' +
                ", decimal=" + decimal +
                '}';
    }
}
