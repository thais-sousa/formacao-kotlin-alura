package aula04

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Colaborador(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario + plr
        }

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
