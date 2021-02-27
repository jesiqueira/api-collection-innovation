package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(1,5,6,63,50,3)

    values.forEach {
        println(it)
    }

    println("================================")
    values.sort()
    values.forEach {
        println(it)
    }
}