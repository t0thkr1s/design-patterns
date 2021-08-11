class Atmosphere private constructor() {

    fun showMessage() {
        println("Hello from Atmosphere!")
    }

    companion object {
        val instance = Atmosphere()
    }
}