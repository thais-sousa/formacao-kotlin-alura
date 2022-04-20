import aula05.Client
import aula05.Diretor
import aula05.Gerente
import aula05.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Thais",
        cpf = "154.545.545-64",
        salario = 1000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Monteiro",
        cpf = "124.524.652-22",
        salario = 2000.0,
        senha = 12345,
        plr = 200.0
    )

    val client = Client(
        nome = "Logan",
        cpf = "984.656.435-98",
        senha = 123
    )

    val acessoSistema = SistemaInterno()
    acessoSistema.acessar(gerente, 1234)
    acessoSistema.acessar(diretor, 12345)
//    acessoSistema.acessar(client, 123)
}