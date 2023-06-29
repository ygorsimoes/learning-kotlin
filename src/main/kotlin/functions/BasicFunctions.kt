package functions

fun main() {
    println("1 + 2 = ${mySum(1, 2)}")
    println("1 + 2 = ${myExpressionBodySum(1, 2)}")
    println("1 + 2 = ${myExpressionBodySumWithInference(1, 2)}")

    println("1 + 2 = ${myFunctionWithDefaultValues(1, 2)}")
    println("1 + 2 = ${myFunctionWithDefaultValues(1, 2, "Hello!")}")
    println("1 + 2 = ${myFunctionWithDefaultValues(message = "Hello, World!")}")
}

fun mySum(numberOne: Int, numberTwo: Int): Int {
    return numberOne + numberTwo
}

fun myExpressionBodySum(numberOne: Int, numberTwo: Int): Int = numberOne + numberTwo

fun myExpressionBodySumWithInference(numberOne: Int, numberTwo: Int) = numberOne + numberTwo

fun myFunctionWithDefaultValues(numberOne: Int = 0, numberTwo: Int = 0, message: String = "Hi!"): Int {
    val result = numberOne + numberTwo
    println(message)
    return result
}

