object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val rectangle: Shape = Rectangle()
        rectangle.draw()
        println()
        val redRectangle: Shape = RedBorderDecorator(Rectangle())
        redRectangle.draw()
        println()
        val circle: Shape = Circle()
        circle.draw()
        println()
        val redCircle: Shape = RedBorderDecorator(Circle())
        redCircle.draw()
    }
}