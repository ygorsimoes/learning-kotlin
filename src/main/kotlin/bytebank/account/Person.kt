package bytebank.account

class Person(
    private val name: String,
    private val cpf: String,
) {
    fun getName(): String {
        return this.name
    }

    fun getCpf(): String {
        return this.cpf
    }
}