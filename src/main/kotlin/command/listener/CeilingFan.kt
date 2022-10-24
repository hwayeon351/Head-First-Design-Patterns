package command.listener

class CeilingFan(val location: String) {
    private var level: Int = 0
    companion object {
        const val HIGH = 2;
        const val MEDIUM = 1;
        const val LOW = 0;
    }

    fun high() {
        level = HIGH
        println("$location ceiling fan is on high")
    }

    fun medium() {
        level = MEDIUM
        println("$location ceiling fan is on medium")
    }

    fun low() {
        level = LOW
        println("$location ceiling fan is on low")
    }

    fun off() {
        level = 0
        println("$location ceiling fan is off")
    }

    fun getSpeed(): Int = level
}