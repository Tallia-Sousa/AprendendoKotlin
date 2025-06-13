fun main(){


    MatrizChar()

}


fun MatrizChar(){

    var linhas = 3
    var colunas = 3

//tem como referencia a tabela asc
    var matriz : Array<Array<Char>> = Array(linhas){ Array(colunas) {' '} }
     var d = 'a'

    for(i in 0 until linhas ){
        for(j in 0 until colunas) {
            matriz[i][j] = d++
        }
    }

    println("Matriz")
    for(i in 0 until linhas ){
        for(j in 0 until colunas) {

            print("${matriz[i][j]} ")
        }
        println()
    }



}