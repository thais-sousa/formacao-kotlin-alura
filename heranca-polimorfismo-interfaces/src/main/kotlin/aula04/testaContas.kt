import aula04.ContaCorrente
import aula04.ContaPoupanca

fun testaContas() {
    val contaCorrente = ContaCorrente(
        titular = "Thais",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Monteiro",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo Conta Corrente após saque: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(50.0, contaPoupanca)

    println("Saldo Conta Corrente após transferir para a poupança: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("Saldo Conta Poupança após transferir para a Corrente: ${contaCorrente.saldo}")
    print("Saldo Conta Corrente após receber transferência: ${contaPoupanca.saldo}")
}
