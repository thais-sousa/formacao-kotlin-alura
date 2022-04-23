package teste

import br.com.thais.bytebank.modelo.Client
import br.com.thais.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X: $numeroX")
    println("Número Y: $numeroY")

    val logan = Client(nome = "Logan", cpf = "", senha = 3)

    val contaLogan = ContaCorrente(logan, 1002)

    val iron = Client(nome = "Iron", cpf = "", senha = 4)

    val contaIron = ContaCorrente(iron, 1003)

    println("Titular da conta do Logan: ${contaLogan.titular}")
    println("Titular da conta do Iron: ${contaIron.titular}")
}