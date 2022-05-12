package br.com.alura

fun main() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Thais") //fazendo uma inserção no nosso banco
    println("Nomes salvos: ${nomesSalvos}") //imprimindo a variável

    println("Nomes - Banco de Nomes: ${BancoDeNomes().nomes}")

    testaColecao()
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

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
        println("Nomes (for): ${nome}")
    }

    println("List nomes: ${nomes}")
    println("Na lista tem o nome Thais? ${nomes.contains("Thais")}")
    println("Tamanho da Coleção: ${nomes.size}")
}

