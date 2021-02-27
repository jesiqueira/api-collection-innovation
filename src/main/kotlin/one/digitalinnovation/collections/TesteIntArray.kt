package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 5
    values[2] = 2
    values[3] = 6
    values[4] = 8

    for (valor  in values){
        println(valor)
    }
    println("=======================")
    values.forEach {valor ->
        println(valor)
    }
    println("=======================")
    for (indice in values.indices){
        println(values[indice])
    }
    println("=======================")
    values.sort() //ordenar o array
    for (valor in values){
        println(valor)
    }
}