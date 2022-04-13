package aula02

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Colaborador(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}