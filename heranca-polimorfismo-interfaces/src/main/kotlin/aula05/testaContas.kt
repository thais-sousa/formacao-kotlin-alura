package aula05

fun testaContas() {
    val contaCorrente = ContaCorrente(
        titular = "Thais",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Monteiro",
        numero = 1001
    )

    val contaSalario = ContaSalario(
        titular = "Logan",
        numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("Saldo Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança: ${contaPoupanca.saldo}")
    println("saldo salário: ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("Saldo Conta Corrente após saque: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança após saque: ${contaPoupanca.saldo}")
    println("Saldo após saque salário: ${contaSalario.saldo}")

    contaCorrente.transfere(50.0, contaPoupanca)

    println("Saldo Conta Corrente após transferir para a poupança: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança após receber transferência: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaSalario)

    println("saldo corrente após transferir para salário: ${contaCorrente.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")

    contaPoupanca.transfere(200.0, contaSalario)

    println("saldo poupança após transferir para salário: ${contaPoupanca.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")
}
