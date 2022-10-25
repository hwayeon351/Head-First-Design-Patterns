package command.command

import command.receiver.Light

class LightOnCommand(val light: Light) : Command {
    override fun execute() {
        light.on()
    }

    override fun getName(): String = "${light.location}Command"
}