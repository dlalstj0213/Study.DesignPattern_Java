# Singleton pattern

Singleton 패턴은 어떠한 클래스(객체)가 유일하게 1개만 존재 할 때 사용한다. (최초 한번만 메모리를 할당)

이를 주로 사용하는 곳은 서로 자우너을 공유 할 때 사용하는데, 실물 세계에서는 프린터가 해당되며, 실제 프로그래밍에서는 TCP Socket 통신에서 서버와 연결된 connect 객체에 주로 사용한다.

|           Singleton           |
| :---------------------------: |
|           instance            |
| singleton()<br/>getInstance() |

## 장점

- 고정된 메모리 영역을 얻으면서 한번의 new로 인스턴스를 사용하기 때문에 메모리 낭비를 방지할 수 있다
- 또한 싱글톤으로 만들어진 클래스의 인스턴스는 전역 인스턴스이기 때문에 다른 클래스의 인스턴스들이 데이터를 공유하기 쉽다.
- DBCP(DataBase Connection Pool)처럼 공통된 객체를 여러개 생성해서 사용해야하는 상황에서 많이 사용한다. (쓰레드풀, 캐시, 대화상자, 사용자 설정, 레지스트리 설정, 로그 기록 객체등)
- 두 번째 이용시부터는 객체 로딩 시간이 현저하게 줄어 성능이 좋아지는 장점이 있다.
출처: https://jeong-pro.tistory.com/86 []

## 단점

- 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유시킬 경우 다른 클래스의 인스턴스들 간에 결합도가 높아져 "개방-폐쇄 원칙" 을 위배하게 된다. (=객체 지향 설계 원칙에 어긋남) 따라서 수정이 어려워지고 테스트하기 어려워진다.
- 또한 멀티쓰레드환경에서 동기화처리를 안하면 인스턴스가 두개가 생성된다든지 하는 경우가 발생할 수 있다.
- 개발을 할때 항상 들어온 goto는 쓰면 안돼! 전역 객체는 안 좋은거야! 라는 말 처럼 꼭 필요한 경우아니면 지양해야한다. // 적절히 잘 쓰면 아주 좋다

## Codes

1. [Non thread-safe 기본적인 싱글톤 코드](./SocketClient.java)
2. [Thread safe Lazy initialization + Double-checked locking 기법](./ThreadSafeLazyInitialization.java)
3. [Initialization on demand holder idiom (holder에 의한 초기화)](./InitializationOnDemandHolderIdiom.java)
- Singleton을 사용했을 때 같은 객체인지 확인해보기 [SingletonValidation.java](./SingletonValidation.java)

### 참고
- [기본기를 쌓는 정아마추어 코딩블로그](https://jeong-pro.tistory.com/86)
