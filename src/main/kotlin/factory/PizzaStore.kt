package factory

//Abstract Creator
abstract class PizzaStore {
    fun orderPizza(type: String): Pizza? {
        val pizza = createPizza(type)
        pizza?.prepare()
        pizza?.bake()
        pizza?.cut()
        pizza?.box()

        return pizza
    }

    //Factory Method
    abstract fun createPizza(type: String): Pizza?
}