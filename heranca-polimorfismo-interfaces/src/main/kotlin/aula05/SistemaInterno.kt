package aula05

class SistemaInterno {

    fun acessar (admin: Autenticavel, senha: Int) {
        if (admin.autenticacao(senha)) {
            println("Seja Bem Vinde!")
        } else {
            println("Falha na Autenticação!")
        }
    }
}