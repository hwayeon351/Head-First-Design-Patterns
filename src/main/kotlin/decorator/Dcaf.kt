package decorator

class Dcaf : Beverage() {
    init {
        description = "Dcaf Coffee"
    }

    override fun cost(): Double {
        return 1.05
    }
}