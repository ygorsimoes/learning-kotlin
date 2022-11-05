package bytebank.employee

import bytebank.account.Person

class Manager(
    owner: Person,
) :
    AbstractEmployee(
        owner = owner,
        jobTitle = "Manager",
        salary = 2000.0,
        bonus = 0.0
    ) {}