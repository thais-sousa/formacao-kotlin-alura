package aula03

open class Colaborador(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    open val bonificacao: Double
        get() {
            return salario * 0.1
        }
}