package com.suns.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qxlx
 * @date 2025/7/9 21:56
 */
@DubboService
public class PayOrderServiceImpl implements PayOrderService{

    @Autowired
    private YhServiceImpl yHServiceImpl;

    @Override
    public boolean payOrder(String orderId) {
        System.out.println("payOrder:" + orderId);
        return true;
    }

    @Override
    public String highPayOrder(boolean flag) {
        return yHServiceImpl.highPayOrder(flag);
    }

}
