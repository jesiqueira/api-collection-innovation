package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 600.2, "PJ")
    val maria = Funcionario("maria", 100.2, "PF")
    val jullio = Funcionario("jullio", 500.2, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(jullio.nome, jullio)

    println(repositorio.findById(jullio.nome))

    println("--------------")

    repositorio.findAll().forEach { println(it) }

    println("--------------")

    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}