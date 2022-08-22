package strategy

class MallardDuck: Duck(){
    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("저는 물오리입니다.")
    }
}