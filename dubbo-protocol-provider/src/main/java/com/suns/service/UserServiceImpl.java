package com.suns.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.beans.factory.annotation.Value;

//@DubboService(weight = 1)
//@DubboService(filter = "-default,myProviderFilter")
@DubboService(filter = "executelimit",methods = {@Method(name="login",executes = 5)})
public class UserServiceImpl implements UserService {

    @Value("${dubbo.protocol.port}")
    private Integer port;

    @Override
    public String login(String name, String password) {
        System.out.println("UserServiceImpl.login name db " + name + " password is " + password);
        return "处理成功" + port;
    }

//    @Override
//    public String login(String name, String password) {
//        System.out.println("UserServiceImpl.login name db " + name + " password is " + password);
//        return "处理成功" + port;
//    }

    @Override
    public boolean logout(String name, String password) {
        System.out.println(Thread.currentThread().getName()+"\tUserServiceImpl.logout name " + name + " password is " + password);
        return false;
    }


}
