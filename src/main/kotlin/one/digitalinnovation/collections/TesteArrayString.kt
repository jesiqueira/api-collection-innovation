package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "Jose"
    nomes[1] = "Lucas"
    nomes[2] = "Adeguimar"

    for (nome in nomes){
        println(nome)
    }
    nomes.sort()
    println("===================")
    nomes.forEach {
        println(it)
    }

    println("================")
    val nomes2 = arrayOf("João", "Maria", "Bruna")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}
