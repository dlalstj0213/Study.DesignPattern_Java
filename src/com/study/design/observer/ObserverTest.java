package com.study.design.observer;

public class ObserverTest {

    public static void main(String[] args) {
        Button button = new Button("버튼");
        /* 익명 클래스 활용 (익명 클래스를 이용하여 추상메소드 정의, new IButtonListener() 생략가능)
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        */

        // 람다 활용
        button.addListener((name) -> {
            System.out.println(name);
        });

        button.click("메시지 전달 : click 1");
        button.click("메시지 전달 : click 2");
        button.click("메시지 전달 : click 3");
        button.click("메시지 전달 : click 4");

    }
}
