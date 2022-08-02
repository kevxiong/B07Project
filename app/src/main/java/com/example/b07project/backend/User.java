package com.example.b07project.backend;

public abstract class User {
    String username;
    String firstname;
    String lastname;
    String password;
    String userType;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String firstname, String lastname, String password, String userType) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.userType = userType;
    }
}
