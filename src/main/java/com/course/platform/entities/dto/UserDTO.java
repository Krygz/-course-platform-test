package com.course.platform.entities.dto;

import com.course.platform.entities.User;
import com.course.platform.enums.Role;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;

public class UserDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @NotBlank(message = "field required")
    private String name;
    @NotBlank(message = "field required")
    private String email;
    @NotBlank
    private String password;
    
    private Role role;

    public UserDTO() {
    }

    public UserDTO(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.role = user.getRole();
    }
    public UserDTO(String name, String email, String encryptedPassword, Role role) {
        this.email = email;
        this.name = name;
        this.password = encryptedPassword;
        this.role = role;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
