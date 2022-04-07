package aula05

fun main() {
    println("Bem vinde ao ByteBank!")

    val contaThais = Conta("Thais", 1000)
    contaThais.deposita(500.0)

    println(contaThais.titular)
    println(contaThais.numero)
    println(contaThais.saldo)


    val contaMonteiro = Conta("Marco", 1001)
    contaMonteiro.deposita(200.0)

    println(contaMonteiro.titular)
    println(contaMonteiro.numero)
    println(contaMonteiro.saldo)

    println("Depositando na conta da Thais:")
    contaThais.deposita(500.0)
    println(contaThais.saldo)

    println("Depositando na conta do Monteiro:")
    contaMonteiro.deposita(500.0)
    println(contaMonteiro.saldo)

    println("Sacando da conta da Thais:")
    contaThais.saca(100.0)
    println(contaThais.saldo)

    println("Sacando da conta do Monteiro:")
    contaMonteiro.saca(200.0)
    println(contaMonteiro.saldo)

    println("Transferindo da conta da Thais para a conta do Marco:")

    if (contaThais.transfere(50.0, contaMonteiro)) {
        println("Transferência realizada com sucesso!")
    } else {
        println("Falha na transferência!")
    }

    println(contaThais.saldo)
    println(contaMonteiro.saldo)
}

class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
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
}

fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X: $numeroX")
    println("Número Y: $numeroY")


    val contaLogan = Conta("Logan", 1002)

    val contaIron = Conta("Iron", 1003)

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

