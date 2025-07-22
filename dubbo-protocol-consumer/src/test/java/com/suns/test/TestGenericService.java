package com.suns.test;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.service.GenericService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author qxlx
 * @date 2025/7/22 21:20
 */
@SpringBootTest
@Slf4j
public class TestGenericService {

    @DubboReference(interfaceName = "com.suns.service.UserService")
    private GenericService genericService;

    @Test
    public void test() {
        Object result = genericService.$invoke("login", new String[]{"java.lang.String", "java.lang.String"}, new Object[]{"admin", "123456"});
        log.info("result = " + result);
    }


}
