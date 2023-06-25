package expressions

fun main() {
    val myAge = 17

    if (openInParty(myAge)) {
        freeDrinks(myAge)
        println("Let's have fun!")
    } else {
        println("Let's go home!")
    }
}

/**
 * if - Expression: Is used to declare a conditional expression, which means that it will return a value.
 * In Kotlin, if is an expression, i.e. it returns a value. Therefore, there is no ternary operator (condition ? then : else),
 * because ordinary if works fine in this role.
 *
 * Example: If the person is over 21 years old, it will return true, otherwise it will return false.
 */
fun openInParty(myAge: Int): Boolean {
    val minimumAge = 21

    return if (myAge >= minimumAge) {
        println("Welcome to Party!")
        println("You have ${freeDrinks(myAge)} free drinks!")
        true
    } else {
        println("Sorry! The party is for people over $minimumAge years!")
        false
    }
}

/**
 * if - Expression: Is used to declare a conditional expression, which means that it will return a value.
 *
 * Example: If the person is over 30 years old, it will return 3, otherwise it will return 0.
 */
fun freeDrinks(myAge: Int): Int {
    val minimumAge = 30
    val maxDrinks = 3

    return if (myAge >= minimumAge) maxDrinks else 0
}