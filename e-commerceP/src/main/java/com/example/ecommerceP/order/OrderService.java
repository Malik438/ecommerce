package com.example.ecommerceP.order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order)
    {
        return orderRepository.save(order);
    }

    public void deleteOrderById(Integer id)
    {
        orderRepository.deleteById(id);
    }

    public Order getOrderById(Integer id)
    {
        return orderRepository.findById(id).orElse(null);
    }
}
