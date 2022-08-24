package decorator

class Mocha(beverage: Beverage) : CondimentDecorator() {
    init {
        this.beverage = beverage
    }

    override fun cost(): Double {
        return beverage!!.cost() + .20
    }

    override fun showDescription(): String {
        return beverage!!.showDescription() + ", Mocha"
    }
}