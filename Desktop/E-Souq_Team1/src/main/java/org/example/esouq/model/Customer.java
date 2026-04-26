package org.example.esouq.model;

import jakarta.persistence.*;

import java.util.List;

// Bechir Ben Zaied

@Entity
@Table(name = "customers")
public class Customer {
    public Customer() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String firstName;

    @Column(length = 50, nullable = false)
    private String lastName;

    @Column(length = 50, nullable = false)
    private String email;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    // getters
    public int getId() {return id;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getEmail() {return email;}
    public List<Order> getOrders() {return orders;}

    // setters
    public void setId(int id) {this.id = id;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setEmail(String email) {this.email = email;}
    public void setOrders(List<Order> orders) {this.orders = orders;}
}
