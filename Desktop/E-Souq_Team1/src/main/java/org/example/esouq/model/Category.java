package org.example.esouq.model;
import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name= "categories")

public class Category {

    public Category(){} //used to build obj from db

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(length = 100, nullable = false)
    private String categoryName;

    @Column(length = 150, nullable = true)
    private String categoryDescription;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public int getCategoryId() {return categoryId;}
    public String getCategoryName() {return categoryName;}
    public String getCategoryDescription() {return categoryDescription;}
    public List<Product> getProducts() {return products;}

    public void setCategoryId(int categoryId) {this.categoryId = categoryId;}
    public void setCategoryName(String categoryName) {this.categoryName = categoryName;}
    public void setCategoryDescription(String categoryDescription) {this.categoryDescription = categoryDescription;}
    public void setProducts(List<Product> products) {this.products = products;}
}
