package org.example.user;

import org.example.common.BaseRepository;

import java.util.UUID;

public class UserRepository extends BaseRepository<UUID, User> {
    private static final UserRepository userRepository = new UserRepository();
    @Override
    protected String getFileName() {
        return "src/main/resources/user.txt";
    }

    public static UserRepository getInstance() {
        return userRepository;
    }
}
