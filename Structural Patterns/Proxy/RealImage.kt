class RealImage(private val fileName: String) : Image {

    override fun display() {
        println("Displaying $fileName")
    }

    private fun loadFileFromDisk() {
        println("Loading file from disk.")
    }

    init {
        loadFileFromDisk()
    }
}
