object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val keyboard: Product = Product.Builder()
            .productId(1)
            .productName("Das keyboard")
            .productType("Keyboard")
            .productWarranty("5 years")
            .productAvailability(true)
            .build()
        println(keyboard)
    }
}