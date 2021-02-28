package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("Joao", 600.2, "PJ")
    val maria = Funcionario("maria", 100.2, "PF")
    val jullio = Funcionario("jullio", 500.2, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("-----------")
    funcionarios.add(jullio)
    funcionarios.forEach { println(it) }

    println("-----------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("-------set----")
    val funcionarioSet = mutableSetOf(joao)
//    funcionarioSet.forEach { println(it) }

    funcionarioSet.add(jullio)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("-----------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }


}