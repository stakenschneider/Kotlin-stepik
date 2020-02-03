package collections

// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProducts = customers.flatMap { it -> it.orders.flatMap { it.products } }.toSet()

    return customers.fold(allProducts, { orderedByAll, customer ->
        orderedByAll.intersect(customer.orders.flatMap { it.products }.toSet())
    })
}

fun main() {
    val banana = Product("Banana", 12.0)
    val apple = Product("Apple", 10.0)
    val candy = Product("Candy", 200.0)
    val onion = Product("Onion", 2.15)
    val oil = Product("Oil", 100.0)

    val order1 = Order(listOf(banana, apple), true)
    val order2 = Order(listOf(apple, candy, candy), false)
    val order3 = Order(listOf(onion, oil), true)

    val saintP = City("SaintP")
    val moscow = City("Moscow")

    val customer1 = Customer("Masha", saintP, listOf(order1))
    val customer2 = Customer("Dasha", moscow, listOf(order2, order3))

    val shop = Shop("Ashan", listOf(customer1, customer2))

//    print(customer2.getTotalOrderPrice())
//    print(shop.getCustomersSortedByNumberOfOrders().map { it.name })
//    println("getOrderedProducts")
//    println(customer1.getOrderedProducts() + "\n\n")
//    println("getAllOrderedProducts")
//    println(shop.getAllOrderedProducts())
//    print(customer2.orders.flatMap { it.products })
}