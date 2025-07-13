package com.suns.test;

import com.suns.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDubbo {

    // 设置对应的应用
    @DubboReference(providedBy = "dubbo-protocol-provider")
    private UserService userService;


    @Test
    public void test1() {
        boolean ret = userService.login("xiaohei", "123456");
        System.out.println("ret = " + ret);
    }

//    @DubboReference(protocol = "rest")
//    private OrderService orderService;

//    @Test
//    void test2() {
//        Order order = orderService.getOrder(1L);
//        System.out.println("order = " + order);
//    }
//
//    @DubboReference(protocol = "grpc")
//    private DubboDemoServiceGrpc.IDemoService iDemoService;
//
//    @Test
//    public void test4() {
//        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
//        try {
//            DemoServiceGrpc.DemoServiceBlockingStub demoServiceBlockingStub = DemoServiceGrpc.newBlockingStub(managedChannel);
//
//            RequestData requestData = RequestData.newBuilder().setName("xiaohei").build();
//            ResponseData responseData = demoServiceBlockingStub.demo(requestData);
//            System.out.println(" reuslt = " + responseData.getResult());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            managedChannel.shutdown();
//        }
//    }
//
//    @Test
//    void test3() {
//        ResponseData ret = iDemoService.demo(RequestData.newBuilder().setName("xiaohei").build());
//        System.out.println("ret.getResult() = " + ret.getResult());
//
//    }
//
//    @Test
//    void test1() {
//        boolean ret = userService.login("xiaohei", "123456");
//        System.out.println("ret = " + ret);
//    }
}
