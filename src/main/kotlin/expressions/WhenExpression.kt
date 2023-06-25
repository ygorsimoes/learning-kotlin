package expressions

fun main() {
    val pizzaOrdered = 8

    println(levelHungryForPizza(pizzaOrdered))
    print(pizzaOrdered(pizzaOrdered))
}

fun levelHungryForPizza(pizza: Int): String {
    return when (pizza) {
        1 -> "Not hungry"
        2 -> "Hungry"
        in 3..Int.MAX_VALUE -> "Very hungry"
        else -> "Are you sure?"
    }
}

fun pizzaOrdered(pizza: Int): String {
    return when {
        pizza <= 0 -> "None ordered"
        else -> "Number of pizza: $pizza"
    }
}

