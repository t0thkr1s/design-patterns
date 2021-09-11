abstract class House {

    fun buildHouse() {
        buildFoundation()
        buildPillars()
        buildWalls()
        buildWindows()
        buildCustomDoor()
        println("House is built.")
    }

    private fun buildWindows() {
        println("Building glass windows.")
    }

    open fun buildCustomDoor() {}
    abstract fun buildWalls()
    abstract fun buildPillars()
    private fun buildFoundation() {
        println("Building foundation with cement, iron rods and sand.")
    }
}
