package command

import command.command.*
import command.receiver.CeilingFan
import command.receiver.GarageDoor
import command.receiver.Light
import command.receiver.Stereo


fun main() {
    val remoteControl = RemoteControl()

    val livingRoomLight = Light("Living Room")
    val kitchenLight = Light("kitchen")
    val ceilingFan = CeilingFan("Living Room")
    val garageDoor = GarageDoor("Garage")
    val stereo = Stereo("Living Room")

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)
    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)
    val ceilingFanOnCommand = CeilingFanOnCommand(ceilingFan)
    val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)
    val garageDoorUpCommand = GarageDoorUpCommand(garageDoor)
    val garageDoorDownCommand = GarageDoorDownCommand(garageDoor)
    val stereoOnWithCDCommand = StereoOnWithCDCommand(stereo)
    val stereoOffCommand = StereoOffCommand(stereo)

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
    remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand)
    remoteControl.setCommand(3, garageDoorUpCommand, garageDoorDownCommand)
    remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand)

    println(remoteControl)

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    remoteControl.onButtonWasPushed(1)
    remoteControl.offButtonWasPushed(1)
    remoteControl.onButtonWasPushed(2)
    remoteControl.offButtonWasPushed(2)
    remoteControl.onButtonWasPushed(3)
    remoteControl.offButtonWasPushed(3)
    remoteControl.onButtonWasPushed(4)
    remoteControl.offButtonWasPushed(4)
}
