package bytebank.employee

import bytebank.account.Person

class Developer(
    owner: Person,
) :
    AbstractEmployee(
        owner = owner,
        jobTitle = "Developer",
        salary = 3000.0,
        bonus = 0.0
    ) {}