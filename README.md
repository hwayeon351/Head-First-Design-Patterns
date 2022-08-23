# Head-First-Design-Patterns
헤드퍼스트 디자인패턴 스터디

### 객체지향 원칙
1. 바뀌는 부분은 캡슐화한다.
2. 상속Inheritance보다는 구성Composition을 활용한다.
3. 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
4. 상호작용하는 객체 사이에서는 가능하면 느슨한 결합을 사용해야 한다.
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
Subject와 Observer가 one-to-many 의존성을 정의하며, 느슨한 결합을 가진다.</br>
<img src="/img/observer_pattern_00.png" title="" alt=""></img>

*****


