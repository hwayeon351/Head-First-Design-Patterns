package factory

//Abstract Factory Pattern - Creator Interface
interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): MutableList<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}