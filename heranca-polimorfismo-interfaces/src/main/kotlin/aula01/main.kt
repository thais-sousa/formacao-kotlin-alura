package aula01

fun main() {
    println("Bem vinde ao ByteBank!")

    val thais = Colaborador(
        nome = "Thais",
        cpf = "153.495.367-05",
        salario = 1000.0
    )

    println("Nome do Colaborador: ${thais.nome}")
    println("CPF do Colaborador: ${thais.cpf}")
    println("Salário do Colaborador: ${thais.salario}")
    println("Bonificação ${thais.bonificacao()}")


    val monteiro = Gerente(
        nome = "Monteiro",
        cpf = "156.7563.495-46",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome do Colaborador: ${monteiro.nome}")
    println("CPF do Colaborador: ${monteiro.cpf}")
    println("Salário do Colaborador: ${monteiro.salario}")
    println("Bonificação ${monteiro.bonificacao()}")

    if (monteiro.autenticacao(1234)) {
        println("Autenticação realizada com sucesso!")
    } else {
        println("Falha na autenticação!")
    }
}
