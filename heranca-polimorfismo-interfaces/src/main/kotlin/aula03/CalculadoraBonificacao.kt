package aula03

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(colaborador: Colaborador) {
        this.total += colaborador.bonificacao
    }
}