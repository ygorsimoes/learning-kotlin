package bytebank

import bytebank.account.CurrentAccount
import bytebank.account.SavingsAccount

fun main() {
    val accountMarcio = CurrentAccount(
        owner = "Marcio",
        balance = 50.0
    )

    val accountGibson = SavingsAccount(
        owner = "Gibson",
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