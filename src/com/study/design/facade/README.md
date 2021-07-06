# Facade pattern

`Facade`는 건물의 앞쪽 정면 이라는 뜻을 가진다. 여러 개의 객체와 실제 사용하는 서브 객체의 사이에 복잡한 의존관계가 있을 때, 중간에 facade라는 객체를 두고, 여기서 제공하는 interface만을 활용하여 기능을 사용하는 방식이다. `Facade`는 자신이 가지고 있는 각 클래스의 기능을 명확히 알아야 한다.

- UML class diagram (*wikipedia*)

![](https://upload.wikimedia.org/wikipedia/en/5/57/Example_of_Facade_design_pattern_in_UML.png)