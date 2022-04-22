package br.com.thais.bytebank.modelo

import modelo.Autenticavel

class SistemaInterno {

    fun acessar (admin: Autenticavel, senha: Int) {
        if (admin.autenticacao(senha)) {
            println("Seja Bem Vinde!")
        } else {
            println("Falha na Autenticação!")
        }
    }
}