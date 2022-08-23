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

    override fun update() {
        if (weatherData.temperature != null) {
            tempCnt ++
            tempSum += weatherData.temperature!!

            if ((maxTemp == null) || (weatherData.temperature!! > maxTemp!!)) maxTemp = weatherData.temperature
            if ((minTemp == null) || (weatherData.temperature!! < minTemp!!)) minTemp = weatherData.temperature

            avgTemp = tempSum / tempCnt
            display()
        }
    }

    override fun display() {
        println("기상 통계\n평균 기온: ${avgTemp}, 최저 기온: ${minTemp}, 최고 기온: ${maxTemp}\n")
    }
}