package teste

import br.com.thais.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X: $numeroX")
    println("Número Y: $numeroY")


    val contaLogan = ContaCorrente("Logan", 1002)

    val contaIron = ContaCorrente("Iron", 1003)

    println("Titular da conta do Logan: ${contaLogan.titular}")
    println("Titular da conta do Iron: ${contaIron.titular}")
}