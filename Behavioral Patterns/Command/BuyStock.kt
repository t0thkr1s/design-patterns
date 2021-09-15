class BuyStock(private val stock: Stock) : Order {

    override fun execute() {
        stock.buy()
    }
}
