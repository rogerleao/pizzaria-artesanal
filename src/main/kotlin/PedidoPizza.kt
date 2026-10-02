class PedidoPizza(
    val pizza: Pizza,
    val diaDaSemana: String
) {

    fun calcularTotal(): Double {
        var total = pizza.calcularPreco()

        if (diaDaSemana.lowercase() == "terça-feira") {
            total *= 0.90
        }

        return total
    }
}