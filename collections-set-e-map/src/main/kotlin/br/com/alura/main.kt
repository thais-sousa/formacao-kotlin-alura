package br.com.alura

fun main() {
//  mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    val pedidos = mapOf(1 to 20.0, 2 to 10.0, 3 to 25.0)
    println(pedidos)

    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido ${it}")
    }

    for(pedido in pedidos) {
        println("Número do pedido: ${pedido.key} - Valor do pedido: $ ${pedido.value}")
    }
}



