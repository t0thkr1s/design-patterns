open class ShapeDecorator(private val shape: Shape) : Shape {
    override fun draw() {
        shape.draw()
    }
}