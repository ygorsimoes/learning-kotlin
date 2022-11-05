package bytebank

import bytebank.account.Person
import bytebank.employee.Developer
import bytebank.employee.Manager

fun main() {
    val accountMarcio = Manager(
        owner = Person(
            name = "Marcio",
            cpf = "123.456.789-00"
        ),
    )

    val accountGibson = Developer(
        owner = Person(
            name = "Gibson",
            cpf = "123.456.789-10"
        ),
    )

    accountGibson.receivesBonus(0.05)
    accountMarcio.receivesBonus(0.02)

    accountMarcio.receivesSalary()
    accountGibson.receivesSalary()

    println(accountMarcio.extract() + "\n")
    println(accountGibson.extract() + "\n")
}