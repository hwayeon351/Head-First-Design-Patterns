package factory

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): MutableList<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}