package bytebank

import bytebank.account.CurrentAccount
import bytebank.account.SavingsAccount

fun main() {
    val accountMarcio = CurrentAccount(
        owner = "Marcio",
        balance = 100.0
    )

    val accountGibson = SavingsAccount(
        owner = "Gibson",
        balance = 100.0
    )

    accountGibson.transfer(accountMarcio, 100.0)

    println(accountMarcio.extract() + "\n")
    println(accountGibson.extract() + "\n")
}