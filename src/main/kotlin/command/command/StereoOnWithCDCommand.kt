package command.command

import command.receiver.Stereo

class StereoOnWithCDCommand(val stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(11)
    }

    override fun getName(): String = "${stereo.location}StereoOnWithCDCommand"
}