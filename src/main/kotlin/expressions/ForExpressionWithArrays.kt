package expressions

fun main() {
    listFruits(arrayOf("Banana", "Apple", "Grape"))
}

fun listFruits(fruits: Array<String>) {
    for (item in fruits.indices) {
        println("Fruit in item $item is ${fruits[item]}.")
    }
}