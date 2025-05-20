fun main(){


    var opc = 1

    var numb1 = 10
    var numb2 = 20

    var resu : Int

    while(opc != 3){
        if(opc == 1){
           resu = sum(numb1, numb2)
            print(resu)
          break
        }
        else if(opc == 2){
            resu =  sub(numb1, numb2)
            println(resu)
           break
        }


    }




}


fun sum(num1 :Int, num2 : Int): Int{
    return num1 + num2
}

fun subtr(nub1: Int, numb2: Int ): Int{
    return nub1 - numb2
}

fun parar(): Int{

    return 3
}
