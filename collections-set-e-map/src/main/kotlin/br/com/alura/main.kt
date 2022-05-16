package br.com.alura

fun main() {
//  mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        1 to 20.0,
        2 to 10.0,
        3 to 25.0
    )
    println(pedidos)

    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido ${it}")
    }

    for (p in pedidos) {
        println("Número do pedido: ${p.key} - Valor do pedido: $ ${p.value}")
    }

    pedidos[4] = 50.0
    pedidos.put(5, 75.0)
    pedidos[1] = 13.0
    pedidos.putIfAbsent(6, 200.0)
    pedidos.putIfAbsent(3, 200.0)
    println(pedidos)

    //remoção
    pedidos.remove(6)
    pedidos.remove(5, 100.0)
    println(pedidos)

}



