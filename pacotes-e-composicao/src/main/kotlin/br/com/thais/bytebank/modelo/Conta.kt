package br.com.thais.bytebank.modelo
abstract class Conta(
    var titular: Client,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }
    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}

class ContaCorrente(
    titular: Client,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}

class ContaPoupanca(
    titular: Client,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}