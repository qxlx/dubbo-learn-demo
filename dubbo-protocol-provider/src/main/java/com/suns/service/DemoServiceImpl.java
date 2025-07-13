package com.suns.service;

import com.suns.DubboDemoServiceGrpc;
import com.suns.RequestData;
import com.suns.ResponseData;
import io.grpc.stub.StreamObserver;

//@DubboService
public class DemoServiceImpl extends DubboDemoServiceGrpc.DemoServiceImplBase {
    @Override
    public void demo(RequestData request, StreamObserver<ResponseData> responseObserver) {
        System.out.println("DemoServiceImpl.demo " + request.getName());
        responseObserver.onNext(ResponseData.newBuilder().setResult("this is result").build());
        responseObserver.onCompleted();
    }
}
