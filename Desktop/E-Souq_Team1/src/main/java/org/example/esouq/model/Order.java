package org.example.esouq.model;

//Mahmoud Alazzeh
import jakarta.persistence.*;

@Entity
@Table(name ="orders" )
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(length = 50, nullable = false)
    private String orderStatus;

    @Column(length = 255, nullable = false)
    private String shippingAddress;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
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
