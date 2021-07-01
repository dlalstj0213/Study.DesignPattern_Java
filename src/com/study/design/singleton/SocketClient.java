package com.study.design.singleton;

// Non thread-safe
public class SocketClient {

    private static SocketClient socketClient = null; // 싱글톤 객체는 자기 자신을 객체로 가지고 있어야한다.

    private SocketClient(){ // 싱글톤 객체는 외부에서 생성자를 직접 호출 할 수 없게 private 접근제한 생성자를 정의해야한다.

    }

    // static getInstance()라는 메소드를 통해 싱글톤 객체를 전달해줘야 한다.
    public static SocketClient getInstrance(){
        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("SocketClient connected");
    }
}
