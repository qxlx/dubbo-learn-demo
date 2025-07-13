package com.suns.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author qxlx
 * @date 2025/7/13 22:11
 */
@Service
public class YhServiceImpl {

    @CircuitBreaker(name = "highPayOrderService", fallbackMethod = "fallback")
    public String highPayOrder(boolean flag)  {
        if (flag) {
            throw new RuntimeException("异常");
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "支付成功";
    }


    public String fallback(boolean flag, Throwable t) {
        return "服务降级 直接返回失败：" + t.getMessage();
    }

}
