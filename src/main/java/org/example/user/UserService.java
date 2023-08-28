package org.example.user;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.common.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserService implements Service<User, UUID> {
    private final UserRepository userRepository = UserRepository.getInstance();
    private static final UserService userService = new UserService();

    @Override
    public User add(User user) {
        List<User> users = getAll();
        for (User existingUser : users) {
            if (existingUser.getPhoneNumber().equals(user.getPhoneNumber())) {
                return null;
            }
        }
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


    public User signIn(String phoneNumber, String password) {
        List<User> users = getAll();
        for (User user : users) {
            if (user != null) {
                if (user.getPhoneNumber().equals(phoneNumber) && user.getPassword().equals(password)) {
                    return user;
                }
            }
        }
        return null;
    }
}
