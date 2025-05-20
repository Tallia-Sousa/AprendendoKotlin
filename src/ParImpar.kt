fun main(){

    var num: Int = 112

    var resu = parImpar(num)

     println(resu)




}

fun parImpar(num: Int): String{

    if(num % 2 == 0){
        return "par"
    }
    else{
        return "impar"
    }
}