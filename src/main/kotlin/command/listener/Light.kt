package command.listener

class Light(val location: String?) {
    fun on() = println("$location light is on")
    fun off() = println("$location light is off")
}