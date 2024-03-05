fun leerOperacion(): String {
    return readLine() ?: "+"
}

fun leerNumero(): Int {
    return readLine()?.toIntOrNull() ?: 0
}

fun sumar(primerNumero: Int, segundoNumero: Int) {
    val resultado: Int = primerNumero + segundoNumero
    println(resultado)
}

fun restar(primerNumero: Int, segundoNumero: Int) {
    val resultado: Int = primerNumero - segundoNumero
    println(resultado)
}

fun multiplicar(primerNumero: Int, segundoNumero: Int) {
    val resultado: Int = primerNumero * segundoNumero
    println(resultado)
}

fun dividir(primerNumero: Int, segundoNumero: Int) {
    if (segundoNumero == 0) {
        println("No se puede dividir entre 0")
    } else {
        val resultado: Int = primerNumero / segundoNumero
        println(resultado)
    }
}

fun usarOperacion(operacion: String, primerNumero: Int, segundoNumero: Int) {
    println("Prueba con IF ELSE")
    when (operacion) {
        "+" -> sumar(primerNumero, segundoNumero)
        "-" -> restar(primerNumero, segundoNumero)
        "*" -> multiplicar(primerNumero, segundoNumero)
        "/" -> dividir(primerNumero, segundoNumero)
        else -> println("Operacion invalida")
    }
}

fun main() {
    val operacion: String = leerOperacion()
    val primerNumero: Int = leerNumero()
    val segundoNumero: Int = leerNumero()

    usarOperacion(operacion, primerNumero, segundoNumero)
}
