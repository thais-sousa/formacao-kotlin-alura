package br.com.thais.bytebank.modelo

abstract class Conta(
    var titular: Client,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }
    abstract fun saca(valor: Double)
}