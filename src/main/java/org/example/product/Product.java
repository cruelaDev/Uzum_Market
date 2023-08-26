package org.example.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.common.BaseEntity;

import java.util.Calendar;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Product extends BaseEntity<UUID> {
    private String name;
    private UUID categoryId;
    private int quantity;
    private double price;
    private UUID merchantId;

//    todo List<Photo>

    private String description;

    private double disCountPrice;

}
