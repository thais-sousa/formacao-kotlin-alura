package aula04

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Colaborador(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario + 0.1
        }
}
