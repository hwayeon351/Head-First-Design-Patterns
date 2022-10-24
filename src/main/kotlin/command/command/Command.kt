package command.command

interface Command {
    fun execute()
    fun getName(): String
}