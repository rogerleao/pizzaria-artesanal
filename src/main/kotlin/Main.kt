fun main() {

    val ingredientes = listOf(
        Ingrediente("Queijo", 5.0),
        Ingrediente("Calabresa", 7.0),
        Ingrediente("Bacon", 8.0)
    )

    val pizza = Pizza(
        tamanho = "grande",
        ingredientes = ingredientes,
        bordaRecheada = true
    )

    val pedido = PedidoPizza(
        pizza = pizza,
        diaDaSemana = "terça-feira"
    )

    println("===== PIZZARIA ARTESANAL =====")
    println("Tamanho: ${pizza.tamanho}")
    println("Ingredientes:")

    for (ingrediente in pizza.ingredientes) {
        println("- ${ingrediente.nome}: R$ ${ingrediente.preco}")
    }

    println("Borda recheada: ${if (pizza.bordaRecheada) "Sim" else "Não"}")
    println("Preço final: R$ ${"%.2f".format(pedido.calcularTotal())}")
}