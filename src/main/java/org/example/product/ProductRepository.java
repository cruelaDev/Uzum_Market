package org.example.product;

import org.example.common.BaseRepository;

import java.util.UUID;

public class ProductRepository extends BaseRepository<UUID,Product> {
    private static  final ProductRepository productRepository = new ProductRepository();
    @Override
    protected String getFileName() {
        return "src/main/resources/product.txt";
    }

    public static ProductRepository getInstance() {
        return productRepository;
    }
}
