package br.com.alura.list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881,
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946,
        )
    )

    //ordenando listas

    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()


//    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
//    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenacaoAnoPublicacao = livros.sortedBy { it.anoPublicacao }.imprimeComMarcadores()

    val ordenacaoTitulos = livros.sortedBy { it.titulo }.imprimeComMarcadores()

    val ordenacaoAutor = livros.sortedBy { it.autor }.imprimeComMarcadores()


    //Filtrando listas

    val titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith("João") } // ex.: verifica se o nome do autor começa com o João
        .sortedBy { it.anoPublicacao } //ordenando por ano de publicação
        .map { it.titulo }

    println(titulos)
}

