package bytebank.account

class CurrentAccount(
    owner: String,
    balance: Double
) : AbstractAccount(
    owner = owner,
    balance = balance,
    rate = 0.2,
)