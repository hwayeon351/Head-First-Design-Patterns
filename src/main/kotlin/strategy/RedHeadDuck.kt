package strategy

class RedHeadDuck : Duck() {
    init {
        flyBehavior = FlyWithWings()
        quackBehavior = Quack()
    }

    override fun display() {
        println("나는 Red head 오리입니다.")
    }
}