object Main {
    
    @JvmStatic
    fun main(args: Array<String>) {
        val computerPart: ComputerPart = Computer()
        computerPart.accept(ComputerPartDisplay())
    }
}
