package aula01

class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int
) {

    fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autenticacao(senha: Int): Boolean {
        if(this.senha == senha) {
            return true
        }
        return false
    }
}