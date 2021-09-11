object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val drawing = Drawing()
        drawing.add(Triangle())
        drawing.add(Rectangle())
        drawing.draw("green")
        drawing.clear()
        drawing.add(Triangle())
        drawing.draw("purple")
    }
}
