package aula05

abstract class Colaborador(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    abstract val bonificacao: Double
}