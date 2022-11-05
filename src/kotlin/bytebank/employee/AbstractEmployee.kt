package bytebank.employee

import bytebank.account.CurrentAccount
import bytebank.account.Person

abstract class AbstractEmployee(
    private val owner: Person,
    private val jobTitle: String,
    protected var salary: Double,
    protected var bonus: Double,
) : CurrentAccount(
    owner = owner,
    balance = 0.0,
) {
    override fun extract(): String {
        return """
            =================================
            Name: ${this.owner.getName()}
            CPF: ${this.owner.getCpf()}
            Number Account: ${this.numberAccount}
            Job Title: ${this.jobTitle}
            Balance: ${this.balance}$
            Salary: ${this.salary}$
            Bonus: ${(this.bonus * 100).toInt()}%
            Rate: ${(this.rate * 100).toInt()}%
            =================================
        """.trimIndent()
    }

    // Receives the salary together with the addition of the bonus.
    fun receivesSalary(): Double {
        this.deposit(this.salary + (this.salary * this.bonus))
        return this.salary
    }

    // Receives the bonus and adds it to the salary. (Cumulative)
    fun receivesBonus(bonus: Double): Double {
        this.bonus += bonus
        return this.bonus
    }
}