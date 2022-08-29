# Head-First-Design-Patterns
헤드퍼스트 디자인패턴 스터디

### 객체지향 원칙
1. 바뀌는 부분은 캡슐화한다.
2. 상속Inheritance보다는 구성Composition을 활용한다.
3. 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
4. 상호작용하는 객체 사이에서는 가능하면 느슨한 결합을 사용해야 한다.
5. 클래스는 확장에는 열려 있어야 하지만 변경에는 닫혀 있어야 한다.(OCP, Open-Closed Principle)
*****

## 전략 패턴 Strategy Pattern
* 정의 </br>
알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있도록 디자인한 패턴

* 특징 </br>
클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있다
</br>
<img src="/img/strategy_pattern_00.png" title="" alt=""></img></br>

*****
## 옵저버 패턴 Observer Pattern
* 정의 </br>
한 객체의 상태가 바뀌며 그 객체에 의존하는 다르 객체에게 연락이 가고 자동으로 내용이 갱신되도록 디자인한 패턴

* 특징 </br>
Subject와 Observer가 one-to-many 의존성을 정의하며, 느슨한 결합을 가진다.
</br>
<img src="/img/observer_pattern_00.png" title="" alt=""></img></br>

*****
## 데코레이터 패턴 Decorator Pattern
* 정의 </br>
객체에 추가 요소를 동적으로 더할 수 있도록 구상 구성요소를 감싸 주는 데코레이터를 사용하는 패턴

* 특징 </br>
OCP(Open-Closed Principle)에 충실하면서도 유연한 디자인을 만들 수 있다.</br>
데코레이터 클래스의 형식은 그 클래스가 감싸는 클래스 형식을 반영(Mirror)한다.</br>
구성 요소의 클라이언트는 데코레이터의 존재를 알 수 없다.</br>
데코레이터 패턴을 사용하면 자잘한 객체가 매우 많이 추가될 수 있으며, 코드가 필요 이상으로 복잡해질 수 있다.

</br>
<img src="/img/decorator_pattern_00.png" title="" alt=""></img></br>
<img src="/img/decorator_pattern_01.png" title="" alt=""></img></br>

*****
## 팩토리 메소드 패턴 Factory Method Pattern
* 정의 </br>
객체를 생성할 때 필요한 인터페이스를 만들고, 어떤 클래스의 인스턴스를 생성할지는 서브클래스에서 결정하도록 디자인한 패턴</br>
**Creator: Product에 수행할 작업을 명시하는 모든 메소드가 구현되어 있다.

* 특징 </br>
Creator와 Product로 나뉜다.</br>
구상 클래스 인스턴스를 생성하는 작업을 서브클래스에게 맡겨 캡슐화할 수 있다.</br>



</br>
<img src="/img/factory_method_pattern_00.png" title="" alt=""></img></br>
