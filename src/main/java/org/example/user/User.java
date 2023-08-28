package org.example.user;

import lombok.*;
import org.example.common.BaseEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(callSuper = true)
public class User extends BaseEntity<UUID> {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phoneNumber;
    private UserType userType;

    @Builder
    public User(UUID uuid, LocalDateTime updated, LocalDateTime created, String firstName, String lastName, String username, String password, String phoneNumber, UserType userType) {
        super(uuid, updated, created);
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
    }
}
