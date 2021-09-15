class Broker {

    private val orders: MutableList<Order> = ArrayList()

    fun takeOrder(order: Order) {
        orders.add(order)
    }

    fun placeOrders() {
        for (order in orders) {
            order.execute()
        }
        orders.clear()
    }
}
