package observer

class WeatherData : Subject {
    private var observers: MutableList<Observer> = mutableListOf()
    private var temperature: Float? = null
    private var humidity: Float? = null
    private var pressure: Float? = null

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        notifyObservers()
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(temperature, humidity, pressure)
        }
    }

}