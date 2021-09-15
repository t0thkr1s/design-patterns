class Stock(var name: String, var quantity: Int) {

    fun buy() {
        println("Bought stock: $name Quantity: $quantity")
    }

    fun sell() {
        println("Sold stock: $name Quantity: $quantity")
    }
}
