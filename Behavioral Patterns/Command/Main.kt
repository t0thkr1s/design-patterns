object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val apple = Stock("Apple", 12)
        val gucci = Stock("Tesla", 20)
        val buyStock = BuyStock(apple)
        val sellStock = SellStock(gucci)
        val broker = Broker()
        broker.takeOrder(buyStock)
        broker.takeOrder(sellStock)
        broker.placeOrders()
    }
}
