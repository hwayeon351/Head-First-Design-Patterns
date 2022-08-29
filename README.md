# Head-First-Design-Patterns
헤드퍼스트 디자인패턴 스터디

### 객체지향 원칙
1. 바뀌는 부분은 캡슐화한다.
2. 상속Inheritance보다는 구성Composition을 활용한다.
3. 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
4. 상호작용하는 객체 사이에서는 가능하면 느슨한 결합을 사용해야 한다.
5. 클래스는 확장에는 열려 있어야 하지만 변경에는 닫혀 있어야 한다.(OCP, Open-Closed Principle)
6. 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다.(의존성 뒤집기 원칙, Dependency Inversion Principle, 고수준 모듈과 저수준 모듈이 하나의 추상 클래스에 )
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
Creator와 Product로 나뉜다.</br>

  * Creator
    * Abstract Creator class: Product를 생성하는 Factory method를 Abstract method로 정의하고, Factory method에 의해 생산된 Product으로 수행할 작업을 명시하는 Methods를 가지고 있다.
    * Concrete Creator class: 실제로 Product 객체를 생성하는 Factory method를 구현한다.(실제 Product를 만드는 방법을 알고 있는 클래스이다.)
  * Product: Creator를 통해 만들어지는 Product
    * Abstract Product class: Product에 대한 Properties와 Methods를 가진다.
    * Concrete Product class: Product의 종류, 즉 실제 생성되는 Product를 표현한다. 모든 Concrete Product class는 Abstract Product class라는 똑같은 인터페이스를 구현한다.

* 특징 </br>
어떤 클래스의 인스턴스를 만들지를 서브클래스에서 결정한다.</br>
자식 Creator가 실제로 어떤 Concrete Product를 생성할지를 결정한다.</br>
상위 Creator는 생산자 클래스가 어떤 Concrete Product를 생성했는지 전혀 모른다.</br>
구상 클래스 인스턴스를 생성하는 작업을 서브클래스에게 맡겨 캡슐화할 수 있다.(클라이언트 코드와 실제 클래스 구현을 분리)</br>
즉, Product를 생성하는 부분과 사용하는 부분을 분리함으로써, 다른 Product를 추가하거나 구성을 변경하더라도 Creator를 변경할 필요가 없다.(Creator 클래스가 ConcreteProduct와 느슨한 결합)</br>
의존성 뒤집기 원칙(Dependency Inversion Principle)을 준수하는 방법 중 하나이다.</br>

</br>
<img src="/img/factory_method_pattern_00.png" title="" alt=""></img></br>


*****
## 추상 팩토리 패턴 Abstract Factory Pattern
* 정의 </br>
서로 연관되거나 의존적인 객체로 이루어진 Product Family(제품군)을 생성하고 추상화할 때 쓸 수 있는 패턴</br>
객체 구성 Composition을 활용하여 객체를 생성합니다.</br>

* 특징 </br>
Abstract Factory는 제품군을 생산하는 추상 인터페이스를 제공한다.</br>
Concrete Factory에서 실제 Product Family를 구성하는 Products를 생성한다.</br>
Abstract Factory에서 각각의 Product 객체를 생성하는 메소드는 Factory Method Pattern으로 구현할 수 있다.</br>
많은 Product가 들어있는 Product Family를 생성하는 경우, 인터페이스가 매우 커질 수 있다.
구상 클래스 인스턴스를 생성하는 작업을 서브클래스에게 맡겨 캡슐화할 수 있다.(클라이언트 코드와 실제 클래스 구현을 분리)</br>
의존성 뒤집기 원칙(Dependency Inversion Principle)을 준수하는 방법 중 하나이다.</br>

</br>
<img src="/img/abstract_factory_pattern_00.png" title="" alt=""></img></br>
