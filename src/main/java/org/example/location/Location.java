package org.example.location;

import org.example.common.BaseEntity;

import java.util.UUID;

public class Location extends BaseEntity<UUID> {
    private String name;
    private UUID addressId;
}
