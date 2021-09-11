class FahrenheitTemperature(private var celsiusTemperature: CelsiusTemperature) : Temperature {
    override var temperature: Double
        get() = convertCelsiusToFahrenheit(celsiusTemperature.temperature)
        set(temperatureInFahrenheit) {
            celsiusTemperature.temperature = convertFahrenheitToCelsius(temperatureInFahrenheit)
        }
    private fun convertFahrenheitToCelsius(fahrenheit: Double): Double = ((fahrenheit - 32) * 5 / 9)
    private fun convertCelsiusToFahrenheit(celsius: Double): Double = (celsius * 9 / 5) + 32
}
