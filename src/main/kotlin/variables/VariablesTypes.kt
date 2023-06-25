package variables

fun main() {
    withTypeInference() // Variables with type inference
    withoutTypeInference() // Variables without type inference
}

/**
 * Variables without type inference: Serves to declare a variable without a specific type.
 */
fun withoutTypeInference() {
    val myString = "I'm a String."
    val myDouble = 3.1415
    val myInt = 25
    val myBoolean = true
    val myChar = 'Y'
    val myFloat = 3.1415f
    val myLong = 91288894L
    val myShort = 10000
    val myByte = 127

    val myVariableInt = 100
    val myVariableDouble = myVariableInt.toDouble()
}

/**
 * Variables with type inference: Serves to declare a variable with a specific type.
 */
fun withTypeInference() {
    val myString: String = "I'm a String."
    val myDouble: Double = 3.1415
    val myInt: Int = 25
    val myBoolean: Boolean = true
    val myChar: Char = 'Y'
    val myFloat: Float = 3.1415f
    val myLong: Long = 91288894L
    val myShort: Short = 10000
    val myByte: Byte = 127

    val myVariableInt: Int = 100
    val myVariableDouble: Double = myVariableInt.toDouble()
}