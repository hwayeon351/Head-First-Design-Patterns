package singleton

object SingletonKotlin {
    val name = "Singleton in Kotlin"
    fun printName() {
        println("My name is ${name}!!")
    }
}

class Singleton {
    companion object {
        var name = "Singleton"
    }
    fun printName() {
        println("My name is ${name}")
    }

    fun setName(name: String) {
        Companion.name = name
    }
}


fun main() {
    println(SingletonKotlin)
    SingletonKotlin.printName()
    println()

    val instanceJava1 = SingletonJava.getInstance()
    println(instanceJava1)
    instanceJava1.printName()
    println()

    val instanceJava2 = SingletonJava.getInstance()
    println(instanceJava2)
    instanceJava2.printName()

    val instanceKotlin1 = Singleton()
    instanceKotlin1.setName("Singleton1")
    val instanceKotlin2 = Singleton()
    instanceKotlin2.setName("Singleton2")

    println()
    instanceKotlin1.printName()
    instanceKotlin2.printName()
}