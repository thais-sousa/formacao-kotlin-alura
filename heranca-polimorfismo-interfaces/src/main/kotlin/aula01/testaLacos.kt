package aula01

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular = "Thais $i"
        val numeroConta = 1000 + i
        var saldoConta = i + 0.0
        i++

        println("Titular da Conta: $titular")
        println("Número da Conta: $numeroConta")
        println("Saldo Atual da Conta: $saldoConta")
        println()
    }
}