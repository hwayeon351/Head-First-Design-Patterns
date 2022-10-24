package command.command

import command.listener.GarageDoor

class GarageDoorUpCommand(val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }

    override fun getName(): String = "${garageDoor.location}GarageDoorUpCommand"

}