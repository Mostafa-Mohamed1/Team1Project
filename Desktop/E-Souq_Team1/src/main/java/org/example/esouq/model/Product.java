package org.example.esouq.model;
import jakarta.persistence.*;

//Mustafa Mohammed
@Entity
@Table(name = "products")
public class Product {

    public Product() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_ID")
    private Long productId;

    @Column(name = "Name", length = 30, nullable = false)
    private String name;

    @Column(name = "Price", nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")   // FK for products table
    private Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
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

    public Category getCategory() {return category;}
    public void setCategory(Category category) {this.category = category;}
}
