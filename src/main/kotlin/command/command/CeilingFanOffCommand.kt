package command.command

import command.receiver.CeilingFan

class CeilingFanOffCommand(private val ceilingFan: CeilingFan): Command {
    override fun execute() {
        ceilingFan.off()
    }

    override fun getName(): String = "${ceilingFan.location}CeilingFanOffCommand"
}