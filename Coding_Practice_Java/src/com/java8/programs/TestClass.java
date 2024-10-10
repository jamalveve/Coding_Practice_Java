package com.java8.programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TestClass {
	    public static void main(String[] args) {
	        UserService userService = new UserService();

	        // Attempt to find a user with ID "1"
	        Optional<User> user1 = userService.findUserById("1");
	        user1.ifPresent(user->System.out.println("user found"+user.getName()));

	        // Attempt to find a user with a non-existing ID "3"
	        Optional<User> user2 = userService.findUserById("3");
	        user2.ifPresentOrElse(
	            user -> System.out.println("User found: " + user.getName()), // Action if user found
	            () -> System.out.println("User not found") // Action if user not found
	        );
	    }
	}

 class UserService {
    private Map<String, User> userDatabase;

    public UserService() {
        userDatabase = new HashMap<>();
        userDatabase.put("1", new User("1", "Alice"));
        userDatabase.put("2", new User("2", "Bob"));
    }

    public Optional<User> findUserById(String id) {
        return Optional.ofNullable(userDatabase.get(id)); // Returns an Optional containing the User, or Optional.empty() if not found
    }
}

 class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}