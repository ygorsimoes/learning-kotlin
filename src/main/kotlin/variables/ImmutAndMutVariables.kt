package variables

fun main() {
    valVariable() // Immutable
    varVariable() // Mutable
}

fun valVariable() {
    val name = "Ygor"
    println(name)

    // name = "Ygor Simões" // Error: Val cannot be reassigned
    // println(name)
}

fun varVariable() {
    var name = "Ygor"
    println(name)

    name = "Ygor Simões"
    println(name)
}