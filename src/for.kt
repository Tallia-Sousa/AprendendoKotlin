fun main(){


var n : Int = 5
// crescente
   for(i in 0 .. n){
       println(i)
   }



    println("\n")

// oq é o downto?? descrescer
    for(i in n downTo 0){
        println(i)
    }

    println("\n")
   var str : String = "Hilizangela Tallia"
    var cont = 0

    for(l in str ){
       if(l in "AaEeIiOoUu" ) {
         cont++
           println("cont = " + cont)
       }
    }


    println("\n")

    for(i in 1.. 10 step 4){
        println("${i}")
    }


    println("\n decrescente pulando de 4  em 4")

    for(i in 10 downTo 1 step 4 ){
        println("${i}")
    }










}