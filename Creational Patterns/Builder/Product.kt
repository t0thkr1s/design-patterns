class Product private constructor(
    private val productId: Int?,
    private val productName: String?,
    private val productType: String?,
    private val productWarranty: String?,
    private val productAvailability: Boolean
) {
    data class Builder(
        var productId: Int = 0,
        var productName: String? = null,
        var productType: String? = null,
        var productWarranty: String? = null,
        var productAvailability: Boolean = false
    ) {
        fun productId(productId: Int) = apply { this.productId = productId }
        fun productName(productName: String) = apply { this.productName = productName }
        fun productType(productType: String) = apply { this.productType = productType }
        fun productWarranty(productWarranty: String) = apply { this.productWarranty = productWarranty }
        fun productAvailability(productAvailability: Boolean) = apply { this.productAvailability = productAvailability }
        fun build() = Product(productId, productName, productType, productWarranty, productAvailability)
    }

    override fun toString(): String {
        val availability: String = if (productAvailability) "Available" else "Out of Stock"
        return "ID: $productId Name: $productName Type: $productType Warranty: $productWarranty Availability: $availability"
    }
}