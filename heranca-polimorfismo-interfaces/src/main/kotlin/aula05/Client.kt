package aula05

class Client(
    val nome: String,
    val cpf: String,
    private val senha: Int
) : Autenticavel {
    override fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}