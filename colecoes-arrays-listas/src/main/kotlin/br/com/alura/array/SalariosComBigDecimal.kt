package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "3500.00", "10000.00")

    val aumento = "1.1".toBigDecimal()
    var aumentoMinimo = "500.00".toBigDecimal()
    val salariosComAumento = salarios.map { salario ->
        if (salario < "5000.00".toBigDecimal()) {
            salario + aumentoMinimo
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()

    println(salarios.contentToString())
    println(salariosComAumento.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}