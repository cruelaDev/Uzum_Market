package org.example;

import org.example.product.Product;
import org.example.product.ProductRepository;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        productRepository.add(new Product("Coffee", UUID.randomUUID(),100,3000,UUID.randomUUID(),"Wake up for coffee",124));
        System.out.println(productRepository);
    }
}