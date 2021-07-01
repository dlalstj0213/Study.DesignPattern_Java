package com.study.design.singleton;

// Thread safe Lazy initialization + Double-checked locking 기법
public class ThreadSafeLazyInitialization {
    private static ThreadSafeLazyInitialization instance;

    private ThreadSafeLazyInitialization(){}

    public static ThreadSafeLazyInitialization getInstance(){
        //Double-checked locking
        if(instance == null){
            synchronized (ThreadSafeLazyInitialization.class) {
                if(instance == null)
                    instance = new ThreadSafeLazyInitialization();
            }

        }
        return instance;
    }

    /**
     * getInstance()에 synchronized를 사용하는 것이 아니라 첫 번째 if문으로
     * 인스턴스의 존재여부를 체크하고 두 번째 if문에서 다시 한번 체크할 때 동기화 시켜서 인스턴스를
     * 생성하므로 thread-safe하면서도 처음 생성 이후에 synchonized 블럭을 타지 않기 때문에 성능저하를 완화했다.
     * 출처: https://jeong-pro.tistory.com/86 [기본기를 쌓는 정아마추어 코딩블로그]
     */
}
