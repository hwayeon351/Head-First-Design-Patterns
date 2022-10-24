package command

import command.command.Command

class RemoteControl(var onCommands: Array<Command?> = arrayOfNulls<Command>(7),
                    var offCommands: Array<Command?> = arrayOfNulls<Command>(7)) {

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot]?.execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot]?.execute()
    }

    override fun toString() : String {
        var stringBuffer = StringBuffer()
        stringBuffer.append("\n---------리모컨---------\n")
        for (i: Int in onCommands.indices) {
            stringBuffer.append("[slot $i] ${onCommands[i]?.getName()}, ${offCommands[i]?.getName()}\n")
        }
        return stringBuffer.toString()
    }
}