package bytebank.account

class SavingsAccount(
    owner: String,
    balance: Double
) : AbstractAccount(
    owner = owner,
    balance = balance,
    rate = 0.5,
)