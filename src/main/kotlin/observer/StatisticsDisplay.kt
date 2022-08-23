package observer

class StatisticsDisplay(weatherData: WeatherData) : Observer, DisplayElement {
    private var avgTemp: Float? = null
    private var maxTemp: Float? = null
    private var minTemp: Float? = null
    private var tempCnt: Int = 0
    private var tempSum = 0.0f

    private var weatherData: WeatherData

    init {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float?, humidity: Float?, pressure: Float?) {
        if (temperature != null) {
            tempCnt ++
            tempSum += temperature

            if ((maxTemp == null) || (temperature > maxTemp!!)) maxTemp = temperature
            if ((minTemp == null) || (temperature < minTemp!!)) minTemp = temperature

            avgTemp = tempSum / tempCnt
            display()
        }
    }

    override fun display() {
        println("기상 통계\n평균 기온: ${avgTemp}, 최저 기온: ${minTemp}, 최고 기온: ${maxTemp}\n")
    }
}