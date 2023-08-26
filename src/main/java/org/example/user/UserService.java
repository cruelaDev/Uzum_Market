package org.example.user;

import org.example.common.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserService implements Service<User, UUID> {
private final UserRepository userRepository = UserRepository.getInstance();
private static  final UserService userService = new UserService();
    @Override
    public User add(User user) {
        return userRepository.add(user);
    }

    @Override
    public void delete(UUID uuid) {
        userRepository.delete(uuid);
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public Optional<User> findById(UUID uuid) {
        return userRepository.findById(uuid);
    }

    public static UserService getInstance() {
        return userService;
    }
}
