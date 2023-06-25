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

fun freeDrinks(myAge: Int): Int {
    val minimumAge = 30
    val maxDrinks = 3

    return if (myAge >= minimumAge) maxDrinks else 0
}