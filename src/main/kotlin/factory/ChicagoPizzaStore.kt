package factory

//Concrete Creator
class ChicagoPizzaStore : PizzaStore() {
    private val ingredientFactory: PizzaIngredientFactory = ChicagoPizzaIngredientFactory()

    //Implement Factory Method
    override fun createPizza(type: String): Pizza? {
        val pizza = when(type) {
            "cheese" -> CheesePizza(ingredientFactory)

            "veggie" -> VeggiePizza(ingredientFactory)

            "clam" -> ClamPizza(ingredientFactory)

            "pepperoni" -> PepperoniPizza(ingredientFactory)

            else -> null
        }
        if (pizza != null) {
            pizza.name = "Chicago Style " + pizza.name
        }

        return pizza
    }
}