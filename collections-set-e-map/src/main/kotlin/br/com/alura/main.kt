package br.com.alura
fun main() {
    val assistiramCursoAndroid: List<String> = listOf<String>("Thais", "Marco", "Logan", "Dimitri")
    val assistiramCursoKotlin: List<String> = listOf("Thais", "Vitória", "João")
    val assistiramAmbos: List<String> = assistiramCursoAndroid + assistiramCursoKotlin

//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramAmbos.distinct())
}


