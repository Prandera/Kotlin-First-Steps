fun main(args: Array<String>) {
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val valor = readLine()!!.toFloat()
    var imposto = 0F
    var variacao: Float

    if (valor <= 2000.00) {
        imposto = 0F
    } else if (2000.00 < valor && valor <= 3000.00) {
        variacao = valor - 2000.00.toFloat()
        imposto = variacao * 0.08.toFloat()
    } else if (3000.00 < valor && valor <= 4500.00) {
        imposto = 1000 * 0.08.toFloat()
        variacao = valor - 3000
        imposto += variacao * 0.18.toFloat()
    } else if (valor > 4500) {
        imposto = (1000 * 0.08.toFloat()) + (1500 * 0.18.toFloat())
        variacao = valor - 4500
        imposto += variacao * 0.28.toFloat()
    }
    if (imposto == 0F) println("Isento") else println("R$ ${imposto.format(2)}")
}