package org.example.esouq.service;

import jakarta.transaction.Transactional;
import org.example.esouq.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.esouq.repositories.OrderDAO;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderDAO orderDao;

    public Order saveOrder(Order order){
        return orderDao.save(order);
    }

    public List<Order> getAllOrders() {
        return orderDao.findAll();
    }

    public Optional<Order> getOrderById(int id) {
        return orderDao.findById(id);
    }

    public List<Order> getOrdersByStatus(String status) {
        return orderDao.findByOrderStatus(status);
    }

    public List<Order> getOrdersByShippingAddress(String address) {
        return orderDao.findByShippingAddress(address);
    }

    @Transactional
    public void updateStatus(int id, String status) {
        orderDao.updateOrderStatusById(id, status);
    }

    public void deleteOrder(int id) {
        orderDao.deleteById(id);
    }
}
