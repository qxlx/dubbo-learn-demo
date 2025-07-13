package com.suns.service;

public interface UserService {
    public boolean login(String name, String password);

    public boolean logout(String name, String password);
}
