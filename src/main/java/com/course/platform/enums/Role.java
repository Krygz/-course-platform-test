package com.course.platform.enums;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


public enum Role{
    ROLE_STUDENT("student"),
    ROLE_INSTRUCTOR("instructor") ,
    ROLE_ADMIN("admin");

    private String role;

     Role(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

