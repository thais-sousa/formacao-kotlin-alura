package br.com.thais.bytebank.modelo

import br.com.thais.bytebank.modelo.ColaboradorAdmin

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : ColaboradorAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override val bonificacao: Double
        get() {
            return salario
        }
}