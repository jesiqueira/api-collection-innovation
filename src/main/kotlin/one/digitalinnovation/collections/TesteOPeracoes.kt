package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(600.00, 200.00, 100.0, 5000.0, 3500.0)

    for (salario  in salarios){
        println(salario)
    }

    println("-------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Media salário: ${salarios.average()}")

    val salarioMaior2500 = salarios.filter { it > 2500 }
    println("----------------")
    salarioMaior2500.forEach{ println(it)}

    println("-------------")
    println(salarios.count{it in 2000.0..5000.0})

    println("-------------")
    println(salarios.find{it == 200.0})
    println(salarios.find{it == 700.0})

    println("-------------")
    println(salarios.any{it == 600.0})
    println(salarios.any{it == 300.0})
}