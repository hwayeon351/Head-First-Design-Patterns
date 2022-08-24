package decorator

class Milk(beverage: Beverage) : CondimentDecorator() {
    init {
        this.beverage = beverage
    }

    override fun cost(): Double {
        return beverage!!.cost() + .10
    }

    override fun showDescription(): String {
        return beverage!!.showDescription() + ", Milk"
    }
}