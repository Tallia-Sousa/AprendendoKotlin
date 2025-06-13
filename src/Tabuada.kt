fun main(){

  TabuadaNumero()


}


fun TabuadaNumero (){

    val multiplicando = 1
    var resut : Int

  for(i in multiplicando..10){
      resut = i * multiplicando
      println("$multiplicando x $i = $resut")
  }

}