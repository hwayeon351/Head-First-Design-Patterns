package observer

interface Observer {
    fun update(temperature: Float?, humidity: Float?, pressure: Float?)
}

interface DisplayElement {
    fun display()
}