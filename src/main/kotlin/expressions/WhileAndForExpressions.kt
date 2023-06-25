package expressions

fun main() {
    countWithWhile(10)
    countWithDoWhile(15)
    countWithFor(20)
}

fun countWithWhile(countTo: Int) {
    var countItem = 1

    while (countItem <= countTo) {
        if (countItem < countTo) print("$countItem, ") else print("$countItem. \n")
        countItem++
    }
}

fun countWithDoWhile(countTo: Int) {
    var countItem = 1

    do {
        if (countItem < countTo) print("$countItem, ") else print("$countItem. \n")
        countItem++
    } while (countItem <= countTo)
}

fun countWithFor(countTo: Int) {
    val count = 1

    for (item in count..countTo) {
        if (item < countTo) print("$item, ") else print("$item. \n")
    }
}
