class SellStock(private val stock: Stock) : Order {
    
    override fun execute() {
        stock.sell()
    }
}
