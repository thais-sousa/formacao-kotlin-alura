package aula01

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