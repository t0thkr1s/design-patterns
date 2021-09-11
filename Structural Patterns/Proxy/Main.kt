object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val image: Image = ProxyImage("image.jpg")
        println("Image will be loaded from disk.")
        image.display()
        println("Image will NOT be loaded from disk.")
        image.display()
    }
}
