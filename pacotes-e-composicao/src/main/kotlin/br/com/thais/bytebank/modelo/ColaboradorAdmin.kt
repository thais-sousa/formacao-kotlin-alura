package br.com.thais.bytebank.modelo

import modelo.Autenticavel
import modelo.Colaborador

abstract class ColaboradorAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Colaborador(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {
    override fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}