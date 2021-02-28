package one.digitalinnovation.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val contratado: String
){
    override fun toString(): String =
        """
            Nome:       $nome
            Salario:    $salario
            comtrato:   $contratado
            
        """.trimIndent()
}