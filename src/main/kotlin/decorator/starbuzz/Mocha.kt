package decorator.starbuzz

class Mocha(private val beverage: Beverage) : CondimentDecorator() {
    override var description = "${beverage.description}, Mocha"

    override fun cost(): Double {
        return beverage!!.cost() + .20
    }
}