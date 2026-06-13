package com.example;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dao.UserRepository;
import com.example.entities.User;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(Demo2Application.class, args);

        UserRepository userRepository =
                context.getBean(UserRepository.class);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== USER MANAGEMENT SYSTEM =====");
            System.out.println("1. Add User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. Display All Users");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    User user = new User();

                    System.out.print("Enter Name: ");
                    user.setName(sc.nextLine());

                    System.out.print("Enter City: ");
                    user.setCity(sc.nextLine());

                    System.out.print("Enter Status: ");
                    user.setStatus(sc.nextLine());

                    User savedUser = userRepository.save(user);

                    System.out.println("User added successfully!");
                    System.out.println(savedUser);
                    break;

                case 2:
                    System.out.print("Enter User ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    Optional<User> optional = userRepository.findById(updateId);

                    if (optional.isPresent()) {

                        User existingUser = optional.get();

                        System.out.print("Enter New Name: ");
                        existingUser.setName(sc.nextLine());

                        System.out.print("Enter New City: ");
                        existingUser.setCity(sc.nextLine());

                        System.out.print("Enter New Status: ");
                        existingUser.setStatus(sc.nextLine());

                        userRepository.save(existingUser);

                        System.out.println("User updated successfully!");
                    } else {
                        System.out.println("User not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter User ID to delete: ");
                    int deleteId = sc.nextInt();

                    if (userRepository.existsById(deleteId)) {
                        userRepository.deleteById(deleteId);
                        System.out.println("User deleted successfully!");
                    } else {
                        System.out.println("User not found!");
                    }
                    break;

                case 4:
                    System.out.println("\n===== ALL USERS =====");

                    Iterable<User> users = userRepository.findAll();

                    users.forEach(System.out::println);

                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}