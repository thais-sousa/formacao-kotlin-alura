package aula01

fun testaCondicoes(saldoConta: Double) {
    when {
        saldoConta > 0.0 -> println("A conta é positiva!")
        saldoConta == 0.0 -> println("A conta é neutra!")
        else -> println("A conta é negativa!")
    }
}