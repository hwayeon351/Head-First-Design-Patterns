package factory

fun main() {
    val nyStore = NYPizzaStore()
    val chicagoStore = ChicagoPizzaStore()

    var edan_pizza = nyStore.orderPizza("cheese")
    println("에단이 주문한 ${edan_pizza?.name}\n")

    edan_pizza = nyStore.orderPizza("veggie")
    println("에단이 주문한 ${edan_pizza?.name}\n")


    var joel_pizza = chicagoStore.orderPizza("pepperoni")
    println("조엘이 주문한 ${joel_pizza?.name}\n")
    joel_pizza = chicagoStore.orderPizza("clam")
    println("조엘이 주문한 ${joel_pizza?.name}\n")
}