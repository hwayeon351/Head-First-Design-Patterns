package decorator.starbuzz

class Soy(private val beverage: Beverage) : CondimentDecorator() {
    override var description = "${beverage.description}, Soy"

    override fun cost(): Double {
        return beverage!!.cost() + .15
    }
}