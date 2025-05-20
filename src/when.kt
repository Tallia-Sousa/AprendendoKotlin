//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {



    var num1 :Int = 20
    var num2 : Int = 180

    var op: Int = 1




    val res = when(op) {
       1 ->  soma(num1, num2)
       2 ->  multiplicar(num1, num2)
       3 -> sub(num1, num2)
       else -> throw IllegalArgumentException("Operação inválida")

   }
     println(res)

}


fun soma(numero : Int, num2 : Int): Int {
    return   numero + num2
}
fun multiplicar(num1: Int, num2 : Int) : Int{
    return num1 * num2
}

fun sub (num1 : Int, num2: Int): Int {
    return num1 - num2
}