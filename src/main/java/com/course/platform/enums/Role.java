package com.course.platform.enums;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


public enum Role{
    STUDENT("student"),
    INSTRUCTOR("instructor") ,
   ADMIN("admin");

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

