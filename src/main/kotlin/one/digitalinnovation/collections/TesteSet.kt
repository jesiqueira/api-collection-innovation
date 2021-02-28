package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("Jose", 600.2, "PJ")
    val maria = Funcionario("maria", 100.2, "PF")
    val jullio = Funcionario("jullio", 500.2, "PJ")

    val funcionario1 = setOf(joao, maria)
    val funcionario2 = setOf(jullio)

    val resultadoUnion = funcionario1.union(funcionario2)
    resultadoUnion.forEach{ println(it)}

    println("---------------------------------------")
    val funcionarios3 = setOf(joao, maria, jullio)
    val resultSubtract = funcionarios3.subtract(funcionario2)
    resultSubtract.forEach { println(it) }

    println("---------------------------------------")
    val resultIntersect = funcionarios3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }
}