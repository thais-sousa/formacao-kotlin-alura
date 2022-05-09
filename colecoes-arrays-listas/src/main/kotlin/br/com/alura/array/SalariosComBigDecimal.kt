package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "3500.00", "10000.00")

    val aumento = "1.1".toBigDecimal()
    var aumentoMinimo = "500.00".toBigDecimal()
    val salariosComAumento = salarios.map { salario ->
        calculaAumentoRelativo(salario, aumentoMinimo, aumento)
    }.toTypedArray()

    println(salarios.contentToString())
    println(salariosComAumento.contentToString())


    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto com salários no primeiro mês: $gastoInicial")


    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acc, salario ->
        acc + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("Gasto com salários em seis meses: $gastoTotal")


    val mediaMaioresSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println("Média dos três maiores salários: $mediaMaioresSalarios")

    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    println("Média dos três menores salários: $mediaMenoresSalarios")
}
private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumentoMinimo: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000.00".toBigDecimal()) {
    salario + aumentoMinimo
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}

