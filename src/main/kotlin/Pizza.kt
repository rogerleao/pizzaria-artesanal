class Pizza(
    val tamanho: String,
    val ingredientes: List<Ingrediente>,
    val bordaRecheada: Boolean
) {

    fun calcularPreco(): Double {
        val precoBase = when (tamanho.lowercase()) {
            "pequena" -> 35.0
            "media" -> 50.0
            "grande" -> 65.0
            else -> 0.0
        }

        var preco = precoBase

        for (ingrediente in ingredientes) {
            preco += ingrediente.preco
        }

        if (bordaRecheada) {
            preco += 9.0
        }

        return preco
    }
}