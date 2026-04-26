package org.example.esouq.repositories;

import jakarta.transaction.Transactional;
import org.example.esouq.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

// Bechir Ben Zaied 764003678
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

    // find customer by their email
    @Query("SELECT c FROM Customer c WHERE LOWER(c.email) LIKE LOWER(CONCAT('%', :email, '%'))")
    List<Customer> findCustomerByEmailContaining(@Param("email") String email);

    // custom jpql for find by id
    @Query("SELECT c FROM Customer c WHERE c.id = :id")
    Optional<Customer> getCustomerById(@Param("id") int id);

    // updating a customers attributes
    @Modifying
    @Transactional
    @Query("UPDATE Customer c SET c.firstName = :firstName, c.lastName = :lastName, c.email = :email WHERE c.id = :id")
    int updateCustomerById(@Param("id") int id, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("email") String email);
}
