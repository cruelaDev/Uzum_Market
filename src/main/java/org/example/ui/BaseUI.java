package org.example.ui;

import org.example.Main;
import org.example.user.User;
import org.example.user.UserService;
import org.example.user.UserType;

import java.time.LocalDateTime;
import java.util.UUID;

public class BaseUI {
    private final UserService userService = UserService.getInstance();

    public void start() {
        boolean isExited = false;
        while (!isExited) {
            System.out.print("""
                    1. Register
                    2. Sign In
                    0. Exit
                    --->  \s""");
            int command = Main.scannerInt.nextInt();
            switch (command) {
                case 1 -> register();
                case 2 -> signIn();
                case 0 -> isExited = true;
                default -> System.out.println("Wrong command!");
            }
        }
    }

    private void signIn() {
        System.out.print("Enter your phone number: ");
        String phoneNumber = Main.scannerStr.nextLine();

        System.out.print("Enter your password: ");
        String password = Main.scannerStr.nextLine();

        User user = userService.signIn(phoneNumber, password);
        if (user == null) {
            System.out.println("Phone number or password is wrong!");
        } else {
            switch (user.getUserType()) {
                case USER -> new UserUI().start(user);
                case ADMIN -> new AdminUI().start(user);
                case COURIER -> new CourierUI().start(user);
                case SALESMAN -> new SalesmanUI().start(user);
                case MERCHANT -> new MerchantUI().start(user);
            }
        }
    }

    private void register() {
        System.out.print("Enter your name: ");
        String name = Main.scannerStr.nextLine();

        System.out.print("Enter your surname: ");
        String surname = Main.scannerStr.nextLine();

        System.out.print("Create your username: ");
        String username = Main.scannerStr.nextLine();

        System.out.print("Create your password: ");
        String password = Main.scannerStr.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = Main.scannerStr.nextLine();

        User user = User.builder()
                .uuid(UUID.randomUUID())
                .firstName(name)
                .lastName(surname)
                .username(username)
                .password(password)
                .phoneNumber(phoneNumber)
                .created(LocalDateTime.now())
                .updated(LocalDateTime.now())
                .userType(UserType.USER)
                .build();
        user = userService.add(user);
        if (user == null) {
            System.out.println("This phone number has been already used");
        } else {
            System.out.println("Registered successfully");
        }
    }
}
