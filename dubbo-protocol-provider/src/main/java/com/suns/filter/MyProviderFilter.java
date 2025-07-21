package com.suns.filter;

import org.apache.dubbo.rpc.*;
import org.springframework.util.StopWatch;

/**
 * @author qxlx
 * @date 2025/7/21 20:54
 */
// 注解生效
//@Activate(group = CommonConstants.PROVIDER)
public class MyProviderFilter implements Filter {

    /**
     *
     * @param invoker : 实际dubbo rpc的调用
     * @param invocation 这次调用过程对应的一些参数
     * @return
     * @throws RpcException
     */
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
//        final String methodName = invocation.getMethodName();
//        final String serviceName = invocation.getServiceModel().getServiceName();
//        System.out.println("MyProviderFilter.invoke serviceName: " + serviceName + " methodName: " + methodName);

        System.out.println("MyProviderFilter.invoke Before");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        //调用后续
        Result invoke = invoker.invoke(invocation);

        stopWatch.stop();
        System.out.println("MyProviderFilter.invoke After result: " + invoke +" api耗时"+ stopWatch.getLastTaskTimeNanos());
        //方法返回值
        return invoke;
    }
}
