package command.receiver

class GarageDoor(val location: String) {
    fun up() = println("$location garage Door is Up")
    fun down() = println("$location garage Door is Down")
    fun stop() = println("$location garage Door is Stooped")
    fun lightOn() = println("$location garage light is On")
    fun lightOff() = println("$location garage light is Off")
}