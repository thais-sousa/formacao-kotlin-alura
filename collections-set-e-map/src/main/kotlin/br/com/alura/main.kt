package br.com.alura

fun main() {
    val nomes: List<String> = listOf(
        "Thais",
        "Marco",
        "Logan",
        "Dimitri"
    )

    for (nome in nomes) {
        println(nome)
    }

    println(nomes)
    println("Na lista tem o nome Thais? ${nomes.contains("Thais")}")
    println("Tamanho da Coleção: ${nomes.size}")
}

