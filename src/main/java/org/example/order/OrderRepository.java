package org.example.order;

import org.example.common.BaseRepository;

import java.util.UUID;

public class OrderRepository extends BaseRepository<UUID,Order> {
    private  static  final OrderRepository orderRepository = new OrderRepository();
    @Override
    protected String getFileName() {
        return "src/main/resources/order.txt";
    }

    public static OrderRepository getInstance() {
        return orderRepository;
    }
}
