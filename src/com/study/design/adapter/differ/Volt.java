package com.study.design.adapter.differ;

/**
 * Volt 클래스는 단순히 volt 값을 가지고 있는 POJO 클래스
 */
public class Volt {

    private int volts;

    public Volt(int v){
        this.volts=v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }

}
