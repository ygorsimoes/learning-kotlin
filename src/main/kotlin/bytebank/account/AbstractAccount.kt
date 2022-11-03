package bytebank.account

abstract class AbstractAccount(
    private val owner: String,
    private var numberAccount: Int,
    private var balance: Double,
) {
    private var rate: Double = 0.0
        set(value) {
            if (value >= 0.0) {
                field = value
            }
        }
        get() {
            if (field >= 0.0) {
                return field
            }
            return 0.0
        }

    // Secondary constructor
    constructor(owner: String, balance: Double, rate: Double) :
            this(owner, (0..1000).random(), balance) {
        this.rate = rate
    }

    // Return the extract of the account.
    fun extract(): String {
        return """
            =================================
            Owner: ${this.owner}
            Number Account: ${this.numberAccount}
            Balance: ${this.balance}
            Rate: ${this.rate}
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
    fun transfer(destinationAccount: AbstractAccount, value: Double): Boolean {
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