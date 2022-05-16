package br.com.alura

fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Thais", "Marco", "Logan", "Dimitri")
    val assistiramCursoKotlin: Set<String> = setOf("Thais", "Vitória", "João")
    //    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos: MutableSet<String> = mutableSetOf()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Walle")

    println(assistiramAmbos)

//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)

//    println(assistiramAmbos.distinct())
}


