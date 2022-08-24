package decorator

class Whip(beverage: Beverage) : CondimentDecorator() {
    init {
        this.beverage = beverage
    }

    override fun cost(): Double {
        return beverage!!.cost() + .10
    }

    override fun showDescription(): String {
        return beverage!!.showDescription() + ", Whip"
    }
}