package decorator.starbuzz

class Whip(private val beverage: Beverage) : CondimentDecorator() {
    override var description = "${beverage.description}, Whip"

    override fun cost(): Double {
        return beverage!!.cost() + .10
    }
}