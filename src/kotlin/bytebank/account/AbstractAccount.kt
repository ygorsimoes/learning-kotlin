package bytebank.account

abstract class AbstractAccount(
    private val owner: Person,
    protected var numberAccount: Int
) {
    var balance: Double = 0.0
        protected set

    protected var rate: Double = 0.0
        private set(value) {
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
    constructor(owner: Person, balance: Double, rate: Double) :
            this(owner, (0..1000).random()) {
        this.rate = rate
        this.balance = balance
    }

    // Return the extract of the account.
    open fun extract(): String {
        return """
            =================================
            Name: ${this.owner.getName()}
            CPF: ${this.owner.getCpf()}
            Number Account: ${this.numberAccount}
            Balance: ${this.balance}$
            Rate: ${(this.rate * 100).toInt()}%
            =================================
        """.trimIndent()
    }

    // Deposit is a method that receives a value and adds it to the balance.
    open fun deposit(value: Double): Boolean {
        if (value > 0) {
            this.balance += value
            return true
        }
        return false
    }

    // Withdraw is a method that receives a value and subtracts it from the balance.
    open fun withdraw(value: Double): Boolean {
        if (value > 0 && value <= this.balance) {
            this.balance -= value
            return true
        }
        return false
    }

    // Transfer is a method that receives a value and subtracts it from the balance of the account that is making
    // the transfer.
    open fun transfer(destinationAccount: AbstractAccount, value: Double): Boolean {
        if (equalsNumberAccount(destinationAccount)) {
            return false
        } else {
            if (value > 0 && value <= this.balance) {
                this.withdraw(value)
                destinationAccount.deposit(value)
                return true
            }
            return false
        }
    }

    // Equals is a method that receives an object and compares it with the current object.
    fun equalsNumberAccount(other: Any?): Boolean {
        if (other == null || other !is AbstractAccount) {
            return false
        }
        return this.numberAccount == other.numberAccount
    }
}