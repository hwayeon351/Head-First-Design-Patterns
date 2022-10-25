package command.command

import command.receiver.GarageDoor

class GarageDoorUpCommand(val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }

    override fun getName(): String = "${garageDoor.location}GarageDoorUpCommand"

}