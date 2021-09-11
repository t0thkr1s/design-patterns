class Drawing : Shape {

    private val shapes: MutableList<Shape> = ArrayList()
    
    override fun draw(color: String) {
        for (shape in shapes) {
            shape.draw(color)
        }
    }

    fun add(shape: Shape) {
        shapes.add(shape)
    }

    fun remove(shape: Shape) {
        shapes.remove(shape)
    }

    fun clear() {
        shapes.clear()
        println("Drawings removed!")
    }
}
