package strategy

fun main() {
    val mallard = MallardDuck()
    mallard.display()
    mallard.performQuack()
    mallard.performFly()
    mallard.swim()
    println()

    val model = ModelDuck()
    model.display()
    model.performQuack()
    model.performFly()
    model.flyBehavior = FlyRocketPowered()
    model.performFly()
    model.swim()
    println()

    val rubberDuck = RubberDuck()
    rubberDuck.display()
    rubberDuck.performQuack()
    rubberDuck.performFly()
    rubberDuck.swim()
    println()

    val redHeadDuck = RedHeadDuck()
    redHeadDuck.display()
    redHeadDuck.performFly()
    redHeadDuck.performQuack()
    redHeadDuck.swim()

}