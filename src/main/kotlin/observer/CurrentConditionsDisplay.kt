package observer

class CurrentConditionsDisplay(weatherData: WeatherData) : Observer, DisplayElement {
    private var humidity: Float? = null
    private var temperature: Float? = null
    private var pressure: Float? = null
    private val weatherData: WeatherData

    init {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float?, humidity: Float?, pressure: Float?) {
        this.humidity = humidity
        this.temperature = temperature
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("현재 조건\n온도: ${temperature}F, 습도: ${humidity}%, 기압: ${pressure}\n")
    }
}