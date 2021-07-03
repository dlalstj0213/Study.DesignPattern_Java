# Proxy pattern

Proxy는 대리인 이라는 뜻으로써, 뭔가를 대신해서 처리하는 것<br/>
Proxy Class를 통해서 대신 전달 하는 형태로 설계되며, 실제 Client는 Proxy로 부터 결과를 받는다. 
Cache의 기능으로도 활용이 가능하다.</br>
SOLID중에서 **개발폐쇄 원칙(OCP)**과 **의존 역전 원칙(DIP)**를 따른다.

프록시 패턴의 UML은 다음과 같다. 

![](https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Proxy_pattern_diagram.svg/439px-Proxy_pattern_diagram.svg.png)
> Wikipedia. Proxy pattern

이는 추상화에 의존하고 있는 덕분에 가능한 일이며, 이를 이용해서 유연한 프로그래밍이 가능하다.

실제 로직과 인가 처리를 분리하여 프로그래밍을 할 수도 있고<br/>
지연 초기화등의 기법도 실제 로직을 담당하는 객체를 수정하지 않고 사용을 할 수 있도록 해준다.

Spring AOP 에서는 Dynamic Proxy 기법을 이용해서, 프록시 클래스를 덧씌워 AOP 를 구현한다고 하고,<br/>
자바의 Collections의 Unmodifiable 시리즈와 synchronized 시리즈도 프록시 패턴을 응용한 객체이다.

데코레이터 패턴과 상당히 유사하나, 다른점들이 몇가지 있는데,

데코레이터는 상속 없이 새로운 기능을 추가하기 위해서 객체를 래핑하는 것이고,<br/>
프록시는 함수 접근을  제어하기 위해서 사용하는 것이다, 또한 <br/>
데코레이터는 흔히 객체의 체인을 갖도록 구성이된다. 하지만 프록시는 체인을 갖지 않는다.<br/>
(객체의 체인을 갖는다는 것은 객체가 감싸고 있는 객체가 또 다른 객체를 갖고있는.. 이런 형태)
그리고, 데코레이터는 언제나 래핑한 객체의 레퍼런스를 갖고있으나, 프록시느 갖고있을수도, 안 갖고 있을 수도 있다.<br/>
예를들아 분산 프록시에서는 프록시는 레퍼런스를 갖고있지 않으며, 지연 초기화에서는 초기화 <br/>시점까지는 프록시할 객체의 레퍼런스를 갖고 있지 않는 점이다.

정말 많은 곳에 사용되고 있고 응용할 곳도 많은 패턴인 듯 하다. 숙지하고 있는 것이 좋은 패턴인 듯 하다.

- [BrowserProxy.java](./BrowserProxy.java)
- [AopBrowser.java](../aop/AopBrowser.java)

## 참고

- https://m.blog.naver.com/gracefulife/220650929598