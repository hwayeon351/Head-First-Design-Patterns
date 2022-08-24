package decorator.starbuzz

class Milk(private val beverage: Beverage) : CondimentDecorator() {
    override var description = "${beverage.description}, Milk"

    override fun cost(): Double {
        return beverage.cost() + .10
    }
}