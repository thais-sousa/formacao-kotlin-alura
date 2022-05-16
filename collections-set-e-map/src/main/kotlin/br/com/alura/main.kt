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

    println(assistiramCursoAndroid union assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)
    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList: MutableList<String> = assistiramAmbos.toMutableList()
    assistiramList.add("Thais")
    println("assistiramList: ${assistiramList}")
    println("assistiramList - Set: ${assistiramList.toSet()}")
}


