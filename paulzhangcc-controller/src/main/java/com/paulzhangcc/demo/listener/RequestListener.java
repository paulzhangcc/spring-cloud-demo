package com.paulzhangcc.demo.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

/**
 * Created by paul on 2017/7/18.
 */
@Component
@Async
public class RequestListener implements ApplicationListener<RequestHandledEvent> {
    @Override
    public void onApplicationEvent(RequestHandledEvent requestHandleEvent) {
        System.out.println(requestHandleEvent);
    }
}
