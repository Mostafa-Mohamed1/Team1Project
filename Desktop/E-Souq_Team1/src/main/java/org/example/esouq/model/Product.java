package org.example.esouq.model;

import jakarta.persistence.*;

@Entity()
@Table(name = "products")
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Product_ID")
        private int productId;

        @Column(name = "Name", length = 30, nullable = false)
        private String name;

        @Column(name = "Price", nullable = false)
        private double price;

    public Product() {};

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
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
