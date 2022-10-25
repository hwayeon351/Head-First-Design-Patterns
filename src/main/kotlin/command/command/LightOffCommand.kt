package command.command

import command.receiver.Light

class LightOffCommand(val light: Light) : Command {
    override fun execute() {
        light.off()
    }

    override fun getName(): String = "${light.location}Command"
}