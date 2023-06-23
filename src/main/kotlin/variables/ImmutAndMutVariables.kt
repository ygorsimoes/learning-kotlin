package variables

fun main() {
    valVariable() // Immutable
    varVariable() // Mutable
}

/**
 * val - Immutable: Is used to declare a read-only variable, which means that its value can not be changed
 * after initialization.
 */
fun valVariable() {
    val name = "Ygor"
    println(name)

    // name = "Ygor Simões" // Error: Val cannot be reassigned
    // println(name)
}

/**
 * var - Mutable: Is used to declare a mutable variable, which means that its value can be changed
 * after initialization.
 */
fun varVariable() {
    var name = "Ygor"
    println(name)

    name = "Ygor Simões"
    println(name)
}