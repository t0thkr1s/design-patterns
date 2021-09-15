class Computer : ComputerPart {
    private val computerParts: Array<ComputerPart> = arrayOf(Monitor(), Keyboard(), Mouse())
    override fun accept(computerPartVisitor: ComputerPartVisitor) {
        for (computerPart in computerParts) {
            computerPart.accept(computerPartVisitor)
        }
        computerPartVisitor.visit(computer = this)
    }
}
