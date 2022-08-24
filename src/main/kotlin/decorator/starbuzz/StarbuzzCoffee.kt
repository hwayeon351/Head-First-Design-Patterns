package decorator.starbuzz

fun main() {
    val beverage: Beverage = Espresso()
    print("${beverage.description} $${beverage.cost()}")

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    print("\n${beverage2.description} $${beverage2.cost()}")

    var beverage3: Beverage = HouseBlend()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    print("\n${beverage3.description} $${beverage3.cost()}")
}
