package factory

abstract class Pizza {
    lateinit var name: String
    lateinit var sauce: Sauce
    lateinit var dough: Dough
    lateinit var veggies: MutableList<Veggies>
    lateinit var cheese: Cheese
    lateinit var pepperoni: Pepperoni
    lateinit var clams: Clams

    abstract fun prepare()

    fun bake(){
        println("Baking...")
    }

    open fun cut(){
        println("피자를 사선으로 자르기")
    }

    fun box(){
        println("Boxing")
    }
}

class CheesePizza(ingredientFactory: PizzaIngredientFactory) : Pizza() {
    private var ingredientFactory: PizzaIngredientFactory

    init {
        name = "Cheese pizza"
        this.ingredientFactory = ingredientFactory
    }

    override fun prepare() {
        println("준비 중: ${name}")
        dough = ingredientFactory.createDough()
        println("${dough.toString()}")
        sauce = ingredientFactory.createSauce()
        println("${sauce.toString()}")
        cheese = ingredientFactory.createCheese()
        println("${cheese.toString()}")
    }
}

class ClamPizza(ingredientFactory: PizzaIngredientFactory): Pizza() {
    private var ingredientFactory: PizzaIngredientFactory

    init {
        name = "Clam pizza"
        this.ingredientFactory = ingredientFactory
    }

    override fun prepare() {
        println("준비 중: ${name}")
        dough = ingredientFactory.createDough()
        println("${dough.toString()}")
        sauce = ingredientFactory.createSauce()
        println("${sauce.toString()}")
        cheese = ingredientFactory.createCheese()
        println("${cheese.toString()}")
        clams = ingredientFactory.createClam()
        println("${clams.toString()}")
    }
}

class PepperoniPizza(ingredientFactory: PizzaIngredientFactory): Pizza() {
    private var ingredientFactory: PizzaIngredientFactory

    init {
        name = "Pepperoni pizza"
        this.ingredientFactory = ingredientFactory
    }

    override fun prepare() {
        println("준비 중: ${name}")
        dough = ingredientFactory.createDough()
        println("${dough.toString()}")
        sauce = ingredientFactory.createSauce()
        println("${sauce.toString()}")
        cheese = ingredientFactory.createCheese()
        println("${cheese.toString()}")
        veggies = ingredientFactory.createVeggies()
        println("${veggies.toString()}")
        pepperoni = ingredientFactory.createPepperoni()
        println("${pepperoni.toString()}")
    }
}

class VeggiePizza(ingredientFactory: PizzaIngredientFactory): Pizza() {
    private var ingredientFactory: PizzaIngredientFactory

    init {
        name = "Veggie pizza"
        this.ingredientFactory = ingredientFactory
    }

    override fun prepare() {
        println("준비 중: ${name}")
        dough = ingredientFactory.createDough()
        println("${dough.toString()}")
        sauce = ingredientFactory.createSauce()
        println("${sauce.toString()}")
        cheese = ingredientFactory.createCheese()
        println("${cheese.toString()}")
        veggies = ingredientFactory.createVeggies()
        println("${veggies.toString()}")
    }
}