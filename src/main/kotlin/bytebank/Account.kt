package bytebank

class Account(
    private var owner: String,
    private var numberAccount: Int,
    private var balance: Double
) {

    fun extract(): String {
        return """
            =================================
            Owner: ${this.owner}
            Number Account: ${this.numberAccount}
            Balance: ${this.balance}
            =================================
        """.trimIndent()
    }

    fun deposit(value: Double): Boolean {
        if (value > 0) {
            this.balance += value
            return true
        }
        return false
    }

    fun withdraw(value: Double): Boolean {
        if (value > 0 && value <= this.balance) {
            this.balance -= value
            return true
        }
        return false
    }

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