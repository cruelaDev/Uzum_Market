package org.example.address;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.common.BaseRepository;

import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AddressRepository extends BaseRepository<UUID, Address> {
    @Override
    protected String getFileName() {
        return "src/main/resources/address.txt";
    }
}
