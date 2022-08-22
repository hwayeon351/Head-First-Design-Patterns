package strategy

class ModelDuck : Duck() {
    init {
        flyBehavior = FlyNoWay();
        quackBehavior = MuteQuack();
    }

    override fun display() {
        println("저는 모형 오리입니다.")
    }
}