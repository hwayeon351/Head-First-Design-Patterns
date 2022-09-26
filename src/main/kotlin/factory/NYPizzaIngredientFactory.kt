package factory

//Abstract Factory Pattern - Concrete Creator
class NYPizzaIngredientFactory: PizzaIngredientFactory {
    //Implement Factory Method
    //Product Family를 구성하는 실제 Product들을 알고 있음
    override fun createDough(): Dough = ThinCrustDough()

    override fun createSauce(): Sauce = MarinaraSauce()

    override fun createCheese(): Cheese = ReggianoCheese()

    override fun createVeggies(): MutableList<Veggies> {
        val veggies = mutableListOf<Veggies>().also {
            it.add(Garlic())
            it.add(Onion())
            it.add(Mushroom())
            it.add(RedPepper())
        }
        return veggies
    }

    override fun createPepperoni(): Pepperoni = SlicedPepperoni()

    override fun createClam(): Clams = FreshClams()
}