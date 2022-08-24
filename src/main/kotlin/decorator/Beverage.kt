package decorator

abstract class Beverage(var description: String = "No Name") {
    abstract fun cost(): Double
    open fun showDescription(): String = description
}