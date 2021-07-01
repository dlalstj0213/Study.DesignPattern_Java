package com.study.design.singleton;

// Initialization on demand holder idiom (holder에 의한 초기화)
public class InitializationOnDemandHolderIdiom {
    private InitializationOnDemandHolderIdiom() {
    }

    private static class SingleTonHolder {
        private static final InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
    }

    public static InitializationOnDemandHolderIdiom getInstance() {
        return SingleTonHolder.instance;
    }

    /**
     * 클래스안에 클래스(Holder)를 두어 JVM의 Class loader 매커니즘과 Class가 로드되는 시점을 이용한 방법, JVM의
     * 클래스 초기화 과정에서 보장되는 원자적 특성을 이용하여 싱글턴의 초기화 문제에 대한 책임을 JVM에 떠넘긴다. holder안에 선언된
     * instance가 static이기 때문에 클래스 로딩시점에 한번만 호출될 것이며 final을 사용해 다시 값이 할당되지 않도록 만든 방법.
     * 현재까지 가장 많이 사용되는 방법
     * 출처: https://jeong-pro.tistory.com/86 [기본기를 쌓는 정아마추어 코딩블로그]
     */
}
