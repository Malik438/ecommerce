package com.example.ecommerceP.order;

import com.example.ecommerceP.product.Product;
import com.example.ecommerceP.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private List<Product> products;
    private Double finalPrice;

    public Order(User user, List<Product> products, Double finalPrice) {
        this.user = user;
        this.products = products;
        this.finalPrice = finalPrice;
    }
}
