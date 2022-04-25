package teste

import br.com.thais.bytebank.modelo.Client
import br.com.thais.bytebank.modelo.Conta
import br.com.thais.bytebank.modelo.ContaCorrente
import br.com.thais.bytebank.modelo.ContaPoupanca
fun main() {

    val monteiro = object {
        val nome: String = "Monteiro"
        val cpf: String = ""
        val senha: Int = 2

        fun autentica(senha: Int) = this.senha == senha
    }

    println("Nome do cliente ${monteiro.nome}")

    val thais = Client(nome = "Thais", cpf = "", senha = 1)

    val contaPoupanca = ContaPoupanca(thais, 1001)
    val contaCorrente = ContaCorrente(thais, 1001)

    testaContas()

    println("Total de Contas: ${Conta.total}")
}





