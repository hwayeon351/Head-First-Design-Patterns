package decorator

abstract class CondimentDecorator : Beverage() {
    lateinit var beverage: Beverage
    abstract override fun showDescription(): String
}