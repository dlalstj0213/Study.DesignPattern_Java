package com.study.design.proxy;

import com.study.design.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class ProxyTest {

    public static void main(String[] args) {
//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();

//        IBrowser iBrowser = new BrowserProxy("www.naver.com");
//        iBrowser.show();
//        iBrowser.show();
//        iBrowser.show();
//        iBrowser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("loading time : "+end.get());
        aopBrowser.show();
        System.out.println("loading time : "+end.get());
    }
}
