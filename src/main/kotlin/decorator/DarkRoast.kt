package decorator

class DarkRoast : Beverage() {
    init {
        description = "Dark Roast Coffee"
    }

    override fun cost(): Double {
        return 0.99
    }
}