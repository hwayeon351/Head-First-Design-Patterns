package observer

class ForecastDisplay(weatherData: WeatherData) : Observer, DisplayElement {
    private var currentPressure: Float? = null
    private var lastPressure: Float? = null
    private val weatherData: WeatherData

    init {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float?, humidity: Float?, pressure: Float?) {
        if (pressure != null) {
            if (currentPressure == null) currentPressure = pressure
            lastPressure = currentPressure
            currentPressure = pressure

            display()
        }
    }

    override fun display() {
        println("기상 예보")
        val forecast = when {
            currentPressure!! > lastPressure!! -> "날씨가 좋아지고 있습니다!\n"
            currentPressure!! < lastPressure!! -> "쌀쌀하며 비가 올 것 같습니다.\n"
            else -> "지금과 비슷할 것 같습니다.\n"
        }
        println("${forecast}")
    }
}