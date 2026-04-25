package org.example.esouq.model;

import jakarta.persistence.*;

@Entity()
@Table(name = "products")
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Product_ID")
        private Long productId;

        @Column(name = "Name", length = 30, nullable = false)
        private String name;

        @Column(name = "Price", nullable = false)
        private double price;

    public Product(int i, String macLaptop, int i1) {};

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
