package br.com.alura.array

fun main() {

    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println(maiorIdade)

    val menorIdade = idades.minOrNull()
    println(menorIdade)

    val media: Double = idades.average()
    println(media)

    val todosMaiores = idades.all { it >= 18 }
    println(todosMaiores)

    val existeMaior = idades.any { it >= 18 }
    println(existeMaior)

    val listaMaiores = idades.filter { it >= 18 }
    println(listaMaiores)

    val busca = idades.find { it == 18 }
    println(busca)
}





