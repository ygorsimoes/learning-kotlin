package bytebank.account

class CurrentAccount(
    owner: String,
    balance: Double
) : AbstractAccount(
    owner = owner,
    balance = balance,
    rate = 0.01,
) {

    // Deposit is a method that receives a value and adds it to the balance with a tax.
    override fun deposit(value: Double): Boolean {
        if (value > 0) {
            this.balance += (value - (value * this.rate))
            return true
        }
        return false
    }
}