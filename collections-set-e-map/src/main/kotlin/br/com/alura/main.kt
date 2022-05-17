package br.com.alura

fun main() {
//  mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        1 to 20.0,
        2 to 70.0,
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )

//    val valorPedido: Double?  pedidos.get(5)
//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)

    //getOrElse
    val mensagem = pedidos.getOrElse(0, {
        "Pedido inexistente"
    })
    println(mensagem)

    //getOrDefault
    val default = pedidos.getOrDefault(0, -1.0)
    println(default)

    //acessando chaves e valores
    println(pedidos.keys)

    for (numero in pedidos.keys) {
        println("Pedido ${numero}")
    }

    println(pedidos.values)

    for (valor in pedidos.values) {
        println("Valor do pedido: ${valor}")
    }

    //filtering
    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50
    }

    println("Pedidos filtrados: ${pedidosFiltrados}")

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println("Valores Filtrados: ${pedidosAcima}")

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println("Números Filtrados: ${pedidosPares}")


    //plus and minus operators
//    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(7 to 90.0, 8 to 20.0, 9 to 50.0))
    println("MapOf ${pedidos}")

    println(pedidos - 6)
    println(pedidos)
    println(pedidos - listOf(2, 3))

    pedidos.putAll(setOf(7 to 90.0, 8 to 20.0, 9 to 50.0))
    println("PutAll ${pedidos}")

    //Remoção por chave
    pedidos.keys.remove(1)
    println("Remoção por chave: ${pedidos}")

    //Remoção por valor
    pedidos.values.remove(50.0)
    println("Remoção por valor: ${pedidos}")


}

fun testaMap(pedidos: MutableMap<Int, Double>) {
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



