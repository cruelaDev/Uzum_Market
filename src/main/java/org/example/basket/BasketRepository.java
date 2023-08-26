package org.example.basket;

import org.example.common.BaseRepository;

import java.util.UUID;

public class BasketRepository extends BaseRepository<UUID,Basket> {
    private static final BasketRepository basketRepository = new BasketRepository();
    @Override
    protected String getFileName() {
        return "src/main/resources/basket.txt";
    }

    public static BasketRepository getInstance() {
        return basketRepository;
    }
}
