package expressions

fun main() {
    val pizzaOrdered = 8

    println(levelHungryForPizza(pizzaOrdered))
    print(pizzaOrdered(pizzaOrdered))
}

/**
 * when - Expression: Is used to declare a conditional expression, which means that it will return a value.
 * In Kotlin, when replaces the switch operator of other languages like Java.
 */
fun levelHungryForPizza(pizza: Int): String {
    return when (pizza) {
        1 -> "Not hungry"
        2 -> "Hungry"
        in 3..Int.MAX_VALUE -> "Very hungry"
        else -> "Are you sure?"
    }
}

/**
 * This is a more concise way to use when.
 * If the pizza is less than or equal to 0, it will return "None ordered", otherwise it will return "Number of pizza: $pizza".
 * The when expression is exhaustive, so no else branch is needed.
 */
fun pizzaOrdered(pizza: Int): String {
    return when {
        pizza <= 0 -> "None ordered"
        else -> "Number of pizza: $pizza"
    }
}

