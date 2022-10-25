package command.command

import command.receiver.GarageDoor

class GarageDoorDownCommand(val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.down()
    }

    override fun getName(): String = "${garageDoor.location}GarageDoorDownCommand"

}