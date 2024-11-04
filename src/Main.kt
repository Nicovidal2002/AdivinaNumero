fun menu(){
    println("1. Jugar")
    println("2. Ver traza del último intento")
    println("3. Salir")
}
fun crearNumero(){
    val lista = listOf(1, 2, 3, 4, 5, 6)
    val listaDesordenada = lista.shuffled()
    val cuatroNumeros = listaDesordenada.take(4)
    val numeroUnido =   cuatroNumeros.joinToString("").toInt()
    println(numeroUnido)
}

fun main() {
    crearNumero()
    menu()
    var entrada = readln().toInt()

    while (entrada != 3){
        println("hola")
        entrada = readln().toInt()
    }
    if (entrada == 3){
        println("Gracias por jugar")
    }

}