package com.suns.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author qxlx
 * @date 2025/7/9 21:56
 */
@DubboService
public class PayOrderServiceImpl implements PayOrderService{

    @Override
    public boolean payOrder(String orderId) {
        System.out.println("payOrder:" + orderId);
        return true;
    }

}
