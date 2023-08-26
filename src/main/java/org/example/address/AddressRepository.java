package org.example.address;

import org.example.common.BaseRepository;

import java.util.UUID;

public class AddressRepository extends BaseRepository<UUID, Address> {
    @Override
    protected String getFileName() {
        return "src/main/resources/address.txt";
    }
}
