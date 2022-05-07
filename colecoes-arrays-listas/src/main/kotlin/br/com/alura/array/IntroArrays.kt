package br.com.alura.array

//Qual o funcionário mais velho de uma equipe?

fun main() {

//    val idade1 = 25
//    val idade2 = 39
//    val idade3 = 19
//
//    val maiorIdade = if (idade1 > idade2 && idade1 > idade3) {
//        idade1
//    } else if (idade2 > idade1 && idade2 > idade3) {
//        idade2
//    } else {
//        idade3
//    }

//    val idades = IntArray(3)
//    idades[0] = 25
//    idades[1] = 39
//    idades[2] = 19

    val idades = intArrayOf(25, 39, 19, 21, 35, 40)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    var menorIdade = Int.MAX_VALUE
    idades.forEach {idade ->
        if(idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(maiorIdade)
    println(menorIdade)

}