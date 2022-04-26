package com.example.ecommerceP.user;

import com.example.ecommerceP.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
