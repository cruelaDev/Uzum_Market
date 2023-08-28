package org.example.basket;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.common.BaseRepository;

import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
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
