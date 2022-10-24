package command.command

import command.listener.Stereo

class StereoOffCommand(val stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }

    override fun getName(): String = "${stereo.location}StereoOffCommand"
}