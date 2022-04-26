package com.example.ecommerceP.product;

import com.example.ecommerceP.product.Product;
import com.example.ecommerceP.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    @Autowired
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }

    public void deleteProductById(Integer id)
    {
        productRepository.deleteById(id);
    }

    public Product getProductById(Integer id)
    {
        return productRepository.findById(id).orElse(null);
    }
}
