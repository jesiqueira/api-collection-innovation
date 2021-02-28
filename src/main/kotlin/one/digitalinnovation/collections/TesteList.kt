package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Jose", 600.2, "PJ")
    val maria = Funcionario("maria", 100.2, "PF")
    val jullio = Funcionario("jullio", 500.2, "PJ")

    val funcionarios = listOf(joao, maria, jullio)

    funcionarios.forEach { println(it) }

    println("-----------")
    println(funcionarios.find { it.nome == "maria" })

    println("-----------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("-----------")
    funcionarios.groupBy{ it.contratado}.forEach { println(it) }


}
