package org.example.model;

public class User {
    private String username;
    private String password;

    // Constructor, Getter & Setter
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
