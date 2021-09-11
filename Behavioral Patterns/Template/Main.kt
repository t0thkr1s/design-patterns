object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        var house: House = WoodenHouse()
        house.buildHouse()
        println()
        house = GlassHouse()
        house.buildHouse()
    }
}
