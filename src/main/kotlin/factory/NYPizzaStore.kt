package factory

//Concrete Creator
class NYPizzaStore : PizzaStore() {
    private val ingredientFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()

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
            pizza.name = "New York Style " + pizza.name
        }

        return pizza
    }
}