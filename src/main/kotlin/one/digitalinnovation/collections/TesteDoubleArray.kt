package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 500.0
    salarios[1] = 900.0
    salarios[2] = 100.0

    salarios.forEach { println(it) }

    println("-----------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }
    println("-----------------")
    val salarios2 = doubleArrayOf(4528.0, 150.0, 568.0, 8955.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}