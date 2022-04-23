package teste

import br.com.thais.bytebank.modelo.Client
import br.com.thais.bytebank.modelo.ContaCorrente

fun testaComportamentosConta() {
    val thais = Client(nome = "Thais", cpf = "", senha = 1)

    val contaThais = ContaCorrente(thais,1000)
    contaThais.deposita(500.0)

    println(contaThais.titular)
    println(contaThais.numero)
    println(contaThais.saldo)

    val monteiro = Client(nome = "Monteiro", cpf = "", senha = 2)

    val contaMonteiro = ContaCorrente(monteiro, 1001)
    contaMonteiro.deposita(200.0)

    println(contaMonteiro.titular)
    println(contaMonteiro.numero)
    println(contaMonteiro.saldo)

    println("Depositando na conta da Thais:")
    contaThais.deposita(500.0)
    println(contaThais.saldo)

    println("Depositando na conta do Monteiro:")
    contaMonteiro.deposita(500.0)
    println(contaMonteiro.saldo)

    println("Sacando da conta da Thais:")
    contaThais.saca(100.0)
    println(contaThais.saldo)

    println("Sacando da conta do Monteiro:")
    contaMonteiro.saca(200.0)
    println(contaMonteiro.saldo)

    println("Transferindo da conta da Thais para a conta do Marco:")

    if (contaThais.transfere(50.0, contaMonteiro)) {
        println("Transferência realizada com sucesso!")
    } else {
        println("Falha na transferência!")
    }

    println(contaThais.saldo)
    println(contaMonteiro.saldo)
}