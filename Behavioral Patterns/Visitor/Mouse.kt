class Mouse : ComputerPart {
    override fun accept(computerPartVisitor: ComputerPartVisitor) {
        computerPartVisitor.visit(mouse = this)
    }
}
