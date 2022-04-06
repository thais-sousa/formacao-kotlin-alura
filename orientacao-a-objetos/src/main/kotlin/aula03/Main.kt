package aula03

fun main() {
    println("Bem vinde ao ByteBank!")

    val contaThais = Conta()
    contaThais.titular = "Thais"
    contaThais.numero = 1000
    contaThais.saldo = 500.0

    println(contaThais.titular)
    println(contaThais.numero)
    println(contaThais.saldo)


    val contaMonteiro = Conta()
    contaMonteiro.titular = "Marco"
    contaMonteiro.numero = 1001
    contaMonteiro.saldo = 200.0

    println(contaMonteiro.titular)
    println(contaMonteiro.numero)
    println(contaMonteiro.saldo)

    println("Depositando na conta da Thais:")
    deposita(contaThais, 50.0)
    println(contaThais.saldo)

    println("Depositando na conta do Monteiro:")
    deposita(contaMonteiro, 100.0)
    println(contaMonteiro.saldo)

}

fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias(){
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



