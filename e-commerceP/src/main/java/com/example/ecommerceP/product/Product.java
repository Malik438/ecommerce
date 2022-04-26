package com.example.ecommerceP.product;

import com.example.ecommerceP.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private String name;
    private String description;
    private Double Price;

    public Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        Price = price;
    }
}