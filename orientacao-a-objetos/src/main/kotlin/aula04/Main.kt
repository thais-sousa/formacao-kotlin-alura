package aula04

fun main() {
    println("Bem vinde ao ByteBank!")

    val contaThais = Conta()
    contaThais.titular = "Thais"
    contaThais.numero = 1000
    contaThais.setSaldo(500.0)

    println(contaThais.titular)
    println(contaThais.numero)
    println(contaThais.getSaldo())


    val contaMonteiro = Conta()
    contaMonteiro.titular = "Marco"
    contaMonteiro.numero = 1001
    contaMonteiro.setSaldo(200.0)

    println(contaMonteiro.titular)
    println(contaMonteiro.numero)
    println(contaMonteiro.getSaldo())

    println("Depositando na conta da Thais:")
    contaThais.deposita(500.0)
    println(contaThais.getSaldo())

    println("Depositando na conta do Monteiro:")
    contaMonteiro.deposita(500.0)
    println(contaMonteiro.getSaldo())

    println("Sacando da conta da Thais:")
    contaThais.saca(100.0)
    println(contaThais.getSaldo())

    println("Sacando da conta do Monteiro:")
    contaMonteiro.saca(200.0)
    println(contaMonteiro.getSaldo())

    println("Transferindo da conta da Thais para a conta do Marco:")

    if (contaThais.transfere(50.0, contaMonteiro)) {
        println("Transferência realizada com sucesso!")
    } else {
        println("Falha na transferência!")
    }

    println(contaThais.getSaldo())
    println(contaMonteiro.getSaldo())
}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if (saldo > 0) {
            saldo = valor
        }
    }


}

fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X: $numeroX")
    println("Número Y: $numeroY")


    val contaLogan = Conta()
    contaLogan.titular = "Logan"

    val contaIron = Conta()
    contaIron.titular = "Iron"

    println("Titular da conta do Logan: ${contaLogan.titular}")
    println("Titular da conta do Iron: ${contaIron.titular}")
}

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

fun testaCondicoes(saldoConta: Double) {
    when {
        saldoConta > 0.0 -> println("A conta é positiva!")
        saldoConta == 0.0 -> println("A conta é neutra!")
        else -> println("A conta é negativa!")
    }
}

