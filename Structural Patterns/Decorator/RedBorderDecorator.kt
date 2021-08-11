class RedBorderDecorator internal constructor(shape: Shape) : ShapeDecorator(shape) {
    override fun draw() {
        super.draw()
        println("Setting red border color.")
    }
}