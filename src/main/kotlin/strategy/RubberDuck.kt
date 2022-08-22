package strategy

class RubberDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Squack()
    }

    override fun display() {
        println("나는 러버덕입니다.")
    }
}