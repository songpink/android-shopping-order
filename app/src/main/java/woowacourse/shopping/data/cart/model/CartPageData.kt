package woowacourse.shopping.data.cart.model

data class CartPageData(
    val cartItems: List<CartItemData>,
    val pageNumber: Int,
    val totalPageSize: Int,
    val pageSize: Int,
    val totalProductSize: Int,
)
