var num1 = 0
var num2 = 0

fun main(){


    println("Digite o primeiro número:")
    num1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    num2 = readLine()!!.toInt()

    println("Escolha a operação: 1 - Soma, 2 - Multiplicação, 3 - Subtração")
    val opc = readLine()!!.toInt()

    val resultado = calculadora(opc)
    println("Resultado: $resultado")


}

fun calculadora( opc : Int ): Int{
    return when(opc){
        1 -> soma(num1, num2)
        2 -> multiplicar(num1, num2)
        3 -> subtrair(num1, num2 )
        else -> {
            println("Opçao invalida")
            0
        }
    }


}


fun somar(num1: Int, num2: Int): Int{
    return num1 + num2
}

fun multiplicacao(num1: Int, num2: Int): Int{
    return num1 + num2

}

fun subtrair(num1: Int, num2: Int): Int{
    return num1 - num2
}
//fun dividir(num1:Int, num2: Int):Int{
//
//}