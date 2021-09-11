import java.math.RoundingMode

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val celsiusTemperature = CelsiusTemperature(0.0)
        val fahrenheitTemperature = FahrenheitTemperature(celsiusTemperature)
        celsiusTemperature.temperature = 36.9
        println(
            "${celsiusTemperature.temperature} C -> ${fahrenheitTemperature.temperature
                .toBigDecimal()
                .setScale(2, RoundingMode.UP)} F"
        )
        fahrenheitTemperature.temperature = 125.4
        println(
            "${fahrenheitTemperature.temperature} F -> ${celsiusTemperature.temperature
                .toBigDecimal().setScale(2, RoundingMode.UP)} C"
        )
    }
}
