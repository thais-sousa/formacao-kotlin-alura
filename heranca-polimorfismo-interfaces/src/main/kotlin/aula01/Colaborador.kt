package aula01

class Colaborador(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    fun bonificacao(): Double {
        return salario * 0.1
    }
}