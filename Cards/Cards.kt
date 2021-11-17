fun main(args: Array<String>) {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        val result=mdc(input[0], input[1])
        println(result)
    }
}

// máximo divisor comum
fun mdc(n1: Int, n2: Int): Int {
    var rest: Int? = null
    var num1 = n1
    var num2 = n2
    do{
        rest = num1 % num2
        num1 = num2
        num2 = rest
    } while(rest != 0)

    return num1
}


