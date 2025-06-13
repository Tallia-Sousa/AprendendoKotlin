fun main(){




var resu = adicionarMusicas("Sweeter Place")




println(resu)


}


fun adicionarMusicas(nomeMusica:String): String {

    var armazenarMusica = mutableListOf<String>()
    armazenarMusica.add(nomeMusica)
    return armazenarMusica.toString()
}



fun vetor_inteiros(){
    var numerosInteiros = intArrayOf(1,4,5,7,8,9,10)
     for(i in 0 .. numerosInteiros.size) {
         println(numerosInteiros[i])
     }
}

fun vetorInteiros(){
    var vInteiros = intArrayOf(0,1,2,4,8)

    for(i in 0 .. vInteiros.size - 1){
        print(vInteiros)
    }

}


fun vetorInteirosDois(){
    var narray = Array(10,{i -> 1})

    for(i in narray){
        println(narray)
    }
}