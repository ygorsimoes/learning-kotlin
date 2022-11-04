package bytebank.account

class SavingsAccount(
    owner: String,
    balance: Double
) : AbstractAccount(
    owner = owner,
    balance = balance,
    rate = 0.03,
) {

    // Transfer is a method that receives a value and subtracts it from the balance of the account that is making the
    // transfer and adds it to the balance of the account that is receiving the transfer with tax.
    override fun transfer(destinationAccount: AbstractAccount, value: Double): Boolean {
        if (equalsNumberAccount(destinationAccount)) {
            return false
        } else {
            if (value > 0 && value <= this.balance) {
                this.withdraw(value)
                destinationAccount.deposit(value - (value * this.rate))
                return true
            }
            return false
        }
    }
}