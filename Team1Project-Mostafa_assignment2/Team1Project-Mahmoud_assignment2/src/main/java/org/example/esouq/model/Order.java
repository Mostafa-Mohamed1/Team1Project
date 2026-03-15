package org.example.esouq.model;

public class Order {
    private int orderId;
    private String orderStatus;
    private String shippingAddress;
    private Customer customer;
    private Product product;

    public Order() {};

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Customer getCustomer() {return customer;}

    public void setCustomer(Customer customer) {this.customer = customer;}

    public Product getProduct() {return product;}

    public void setProduct(Product product) {this.product = product;}
}
