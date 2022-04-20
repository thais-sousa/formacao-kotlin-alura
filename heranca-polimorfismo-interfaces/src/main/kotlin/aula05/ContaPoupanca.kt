package aula05

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(saldo >= valorComTaxa) {
            saldo -= valorComTaxa
        }
    }
}