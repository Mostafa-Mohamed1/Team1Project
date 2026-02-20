package org.example.esouq.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Category {
    private int id;
    private String type;
    private String description;
    private List<Product> products;


    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
