fun main(){
    var entradaUser : Double

    println("Digite a temperatura em Graus Celsius")
    entradaUser = readLine()!!.toDouble()

    var temperaturaConvertida = converterTemperatura(entradaUser)

    println("Temperatura Convertida: ${temperaturaConvertida}")


}


fun converterTemperatura(temperaturaCelsius: Double): Double{

    var fahrenheit : Double

    fahrenheit = temperaturaCelsius * 1.8 + 32

    return fahrenheit

}