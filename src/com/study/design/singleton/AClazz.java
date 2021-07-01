package com.study.design.singleton;

public class AClazz {
    private SocketClient socketClient;

    public AClazz(){
        this.socketClient = SocketClient.getInstrance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
