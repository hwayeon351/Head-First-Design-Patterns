package factory

class NYPizzaIngredientFactory: PizzaIngredientFactory {
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