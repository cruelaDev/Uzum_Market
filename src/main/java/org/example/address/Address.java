package org.example.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.common.BaseEntity;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(callSuper = true)
public class Address extends BaseEntity<UUID> {
    private String country;
    private String city;
    private String street;
    private String homeNumber;
}
