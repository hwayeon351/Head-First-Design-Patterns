package command.command

import command.receiver.Stereo

class StereoOffCommand(val stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }

    override fun getName(): String = "${stereo.location}StereoOffCommand"
}