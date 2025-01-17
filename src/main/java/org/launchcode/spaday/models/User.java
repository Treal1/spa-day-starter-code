package org.launchcode.spaday.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
    @NotBlank (message = "Has to be between 5 and 15 characters long.")
    @Size(min = 5, max = 15)
    private String username;
    @Email
    private String email;
    @NotBlank (message = "Has to be at least 6 characters long.")
    @Min (6)
    private String password;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
