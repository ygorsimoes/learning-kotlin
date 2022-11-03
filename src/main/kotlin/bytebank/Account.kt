package bytebank

class Account(
    private var owner: String,
    private var numberAccount: Int,
    private var balance: Double
) {

    // Return the extract of the account.
    fun extract(): String {
        return """
            =================================
            Owner: ${this.owner}
            Number Account: ${this.numberAccount}
            Balance: ${this.balance}
            =================================
        """.trimIndent()
    }

    // Deposit is a method that receives a value and adds it to the balance.
    fun deposit(value: Double): Boolean {
        if (value > 0) {
            this.balance += value
            return true
        }
        return false
    }

    // Withdraw is a method that receives a value and subtracts it from the balance.
    fun withdraw(value: Double): Boolean {
        if (value > 0 && value <= this.balance) {
            this.balance -= value
            return true
        }
        return false
    }

    // Transfer is a method that receives a value and subtracts it from the balance of the account that is making
    // the transfer.
    fun transfer(destinationAccount: Account, value: Double): Boolean {
        if (destinationAccount.owner != this.owner) {
            if (value > 0 && value <= this.balance) {
                this.balance -= value
                destinationAccount.deposit(value)
                return true
            }
        }
        return false
    }
}