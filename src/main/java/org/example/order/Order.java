package org.example.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.common.BaseEntity;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(callSuper = true)
public class Order extends BaseEntity<UUID> {
    private List<UUID> productId;
    private UUID customerId;
    private UUID locationId;
    private UUID courierId;
}
