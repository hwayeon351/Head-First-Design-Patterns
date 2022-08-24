package decorator.starbuzz

abstract class Beverage(open var description: String = "No Name") {
    abstract fun cost(): Double
}