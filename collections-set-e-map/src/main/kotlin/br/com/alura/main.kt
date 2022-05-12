package br.com.alura

fun main() {
    val banco = BancoDeNomes()
    banco.salva("Thais")
    println(banco.nomes)

    println(BancoDeNomes().nomes)

    testaColecao()
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados

    fun salva(nome: String) {
        dados.add(nome)
    }
    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
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

