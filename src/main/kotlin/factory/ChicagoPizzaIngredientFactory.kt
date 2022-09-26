package factory

//Abstract Factory Pattern - Concrete Creator
class ChicagoPizzaIngredientFactory: PizzaIngredientFactory {
    //Implement Factory Method
    //Product Family를 구성하는 실제 Product들을 알고 있음
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