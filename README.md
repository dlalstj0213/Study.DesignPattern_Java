# 디자인 패턴

- **디자인 패턴 바로가기**
  - [싱글톤 패턴](./src/com/study/design/singleton)
  - [어댑터 패턴](./src/com/study/design/adapter)
  - [프록시 패턴](./src/com/study/design/proxy)
  - [데코레이터 패턴](./src/com/study/design/decorator)
  - [옵저버 패턴](./src/com/study/design/observer)
  - [파사드 패턴](./src/com/study/design/facade)
  - [전략 패턴](./src/com/study/design/strategy)

### 디자인 패턴 이란?

자주 사용하는 설계 패턴을 정형화해서 이를 유형별로 가장 최적의 방법으로 개발을 할 수 있도록 정해둔 설계 알고리즘과 유사 하지만, 명확하게 정답이 있는 형태는 아니며, 프로젝트의 상황에 맞추어 적용 가능하다.

### Gof 디자인 패턴

소프트웨어를 설계 할 때는 기존에 경험이 매우 중요하다. 그러나 모든 사람들이 다양한 경험을 가지고 있을 수는 없다.

이러한 지식을 공유하기 위해서 나온 것이 GOF(Gang of Four)의 디자인 패턴이다. 객체지향 개념에 따른 설계 중 재사용할 경우 유용한 설계를 디자인 패턴으로 정리 해둔 것이다.

Gof의 디자인 패턴은 총 23개이며, 이를 잘 이해하고 활용한다면, 경험이 부족하더라도 좋은 소프트웨어 설계가 가능하다.

### 디자인 패턴의 장점

- 개발자(설계자) 간의 원활한 소통
- 소프트웨어 구조 파악 용이
- 재사용을 통한 개발 시간 단축
- 설계 변경 요청에 대한 유연한 대처


### 디자인 패턴의 단점

- 객체지향 설계 / 구현
- 초기 투자 비용 부담

## 생성 패턴

객체를 생성하는 것과 관련된 패턴으로, 객체의 생성과 변경이 전체 시스템에 미치는 영향을 최소화 하고, 코드의 유연성을 높여 준다.
- Factory Method
- **Singleton**
- Prototype
- **Builder**
- Abstract Factory
- **Chaining** (Gof에 나와있는 패턴은 아님 하지만 롬복 설정을 통해 자주 사용하기 때문에 넣어둠)

## 구조 패턴

프로그램 내의 자료구조나 인터페이스 구조 등 프로그램 구조를 설계하는데 활용 될 수 있는 패턴 클래스, 객체들의 구성을 통해서 더 큰 구조를 만들 수 있게 해준다.
큰 규모의 시스템에서는 많은 클래스들이 서로 의존성을 가지게 되는데, 이런 복잡한 구조를 개발 하기 쉽게 만들어 주고, 유지 보수 하기 쉽게 만들어 준다.
- **Adapter**
- Composite
- Bridge
- **Decorator**
- **Facade**
- Flyweight
- **Proxy**

## 행위 패턴

반복적으로 사용되는 객체들의 상호작용을 패턴화한 것으로, 클래스나 객체들이 상호작용하는 방법과 책임을 분산하는 방법을 제공한다. 행위 패턴은 행위 관련 패턴을 사용하여 독립적으로 일을 처리하고자 할 때 사용.
- Template Method
- Interpreter
- Iterator
- **Observer**
- **Strategy**
- Visitor
- Chain of responsibility
- Command
- Mediator
- State
- Memento