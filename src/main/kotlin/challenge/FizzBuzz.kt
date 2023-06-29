package challenge

fun main() {
    println(fizzBuzz(20))
}

fun fizzBuzz(n: Int): List<String> {
    if (n <= 0 || n >= 100) return listOf("Please, numbers from 1 to 100!")

    val listBuzz: List<String> = (1..n).map {
        when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
    }

    return listBuzz
}