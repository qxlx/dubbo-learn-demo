package com.suns.service;

public interface UserService {
    public String login(String name, String password);

    public boolean logout(String name, String password);
}
