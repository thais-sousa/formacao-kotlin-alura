package br.com.thais.bytebank.modelo

import br.com.thais.bytebank.modelo.ColaboradorAdmin

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : ColaboradorAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override val bonificacao: Double
        get() {
            return salario + plr
        }
}
