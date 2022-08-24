package decorator

class Soy(beverage: Beverage) : CondimentDecorator() {
    init {
        this.beverage = beverage
    }

    override fun cost(): Double {
        return beverage!!.cost() + .15
    }

    override fun showDescription(): String {
        return beverage!!.showDescription() + ", Soy"
    }
}