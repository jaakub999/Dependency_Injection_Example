package com.di.framework.user;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void logIn() {
        System.out.println("User logged in");
    }
}