package factory

class ChicagoPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough = ThickCrustDough()

    override fun createSauce(): Sauce = PlumTomatoSauce()

    override fun createCheese(): Cheese = MozzarellaCheese()

    override fun createVeggies(): MutableList<Veggies> {
        val veggies = mutableListOf<Veggies>().also {
            it.add(BlackOlives())
            it.add(Spinach())
            it.add(EggPlant())
        }
        return veggies
    }

    override fun createPepperoni(): Pepperoni = SlicedPepperoni()

    override fun createClam(): Clams = FrozenClams()
}