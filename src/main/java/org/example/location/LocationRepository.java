package org.example.location;

import org.example.common.BaseRepository;

import java.util.UUID;

public class LocationRepository extends BaseRepository<UUID,Location> {
    @Override
    protected String getFileName() {
        return "src/main/resources/location.txt";
    }
}
