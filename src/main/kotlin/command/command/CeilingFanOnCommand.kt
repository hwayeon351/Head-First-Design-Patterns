package command.command

import command.listener.CeilingFan

class CeilingFanOnCommand(private val ceilingFan: CeilingFan): Command {
    override fun execute() {
        ceilingFan.high()
    }

    override fun getName(): String = "${ceilingFan.location}CeilingFanOnCommand"
}