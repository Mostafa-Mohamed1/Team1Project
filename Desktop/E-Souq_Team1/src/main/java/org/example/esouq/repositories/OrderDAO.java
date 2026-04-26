package org.example.esouq.repositories;

import org.example.esouq.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


//Mahmoud Alazzeh
public interface OrderDAO extends JpaRepository<Order, Integer> {

    List<Order> findByOrderStatus(String orderStatus);

    @Query("SELECT o FROM Order o WHERE o.shippingAddress = :address")
    List<Order> findByShippingAddress(@Param("address") String address);

    @Transactional
    @Modifying
    @Query("UPDATE Order o SET o.orderStatus = :status WHERE o.orderId = :id")
    int updateOrderStatusById(@Param("id") int id, @Param("status") String status);
}
