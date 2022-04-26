package com.example.ecommerceP.product;

import com.example.ecommerceP.product.Product;
import com.example.ecommerceP.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class ProductController {

    
        @Autowired
        private final ProductService productService;

        @Autowired
        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        @PostMapping("/api/product")
        public Product addProduct(@RequestBody Product product) {
            return productService.saveProduct(product);
        }

        @PutMapping("/api/product")
        public Product updateProduct(@RequestBody Product product) {
            return productService.saveProduct(product);
        }

        @DeleteMapping("/api/product/{id}")
        public ResponseEntity.BodyBuilder deleteProduct(@PathVariable Integer id) {
            productService.deleteProductById(id);
            return ResponseEntity.ok();
        }
    
}
