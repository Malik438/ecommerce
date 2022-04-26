package com.example.ecommerceP.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/order")
    public Order addOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @PutMapping("/api/order")
    public Order updateOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @DeleteMapping("/api/order/{id}")
    public ResponseEntity.BodyBuilder deleteOrder(@PathVariable Integer id) {
        orderService.deleteOrderById(id);
        return ResponseEntity.ok();
    }
}
