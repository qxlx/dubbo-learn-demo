package com.suns.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String name, String password) {
        System.out.println("UserServiceImpl.login name " + name + " password is " + password);
        return false;
    }

    @Override
    public boolean logout(String name, String password) {
        System.out.println("UserServiceImpl.logout name " + name + " password is " + password);
        return false;
    }


}
