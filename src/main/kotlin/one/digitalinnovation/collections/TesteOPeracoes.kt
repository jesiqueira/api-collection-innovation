package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(600.00, 200.00, 100.0)

    for (salario  in salarios){
        println(salario)
    }

    println("-------------")
    println("Marios salário: $(salarios.max())")
}