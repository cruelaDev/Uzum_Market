package org.example.location;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.common.BaseRepository;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LocationRepository extends BaseRepository<UUID,Location> {
    @Override
    protected String getFileName() {
        return "src/main/resources/location.txt";
    }
}
