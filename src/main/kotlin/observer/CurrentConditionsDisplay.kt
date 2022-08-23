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

    override fun update() {
        this.humidity = weatherData.humidity
        this.temperature = weatherData.temperature
        this.pressure = weatherData.pressure
        display()
    }

    override fun display() {
        println("현재 조건\n온도: ${temperature}F, 습도: ${humidity}%, 기압: ${pressure}\n")
    }
}