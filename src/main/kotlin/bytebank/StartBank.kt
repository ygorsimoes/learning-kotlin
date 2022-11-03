package bytebank

fun main() {
    val accountMarcio = Account(
        owner = "Marcio",
        numberAccount = 12345,
        balance = 50.0
    )
    val accountGibson = Account(
        owner = "Gibson",
        numberAccount = 23456,
        balance = 100.0
    )

    accountMarcio.deposit(100.0)
    accountMarcio.deposit(100.0)
    accountMarcio.withdraw(150.0)

    accountGibson.deposit(100.0)
    accountGibson.withdraw(5.0)

    accountMarcio.transfer(accountGibson, 100.0)

    println(accountMarcio.extract() + "\n")
    println(accountGibson.extract() + "\n")
}