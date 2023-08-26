package org.example.basket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.common.BaseEntity;
import org.example.product.Product;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(callSuper = true)
public class Basket extends BaseEntity<UUID> {
    private List<Product> products;
    private UUID customerId;
}
