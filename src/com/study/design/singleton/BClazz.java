package com.study.design.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz(){
        this.socketClient = SocketClient.getInstrance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
