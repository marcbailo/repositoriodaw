#1. Gestió de Viatges:
   - Poder afegir un nou viatge a la llista.
   - Poder obtenir informació resumida de tots els viatges.
   - Donar informació detallada d'un viatge específic.

Gestión de viajes
   1.1 - Añadir viaje seleccionado
   1.2 - Resumir los viajes
   1.3 - Que nos devuelva la información resumida
   1.4 - Detallar información por viaje
   1.5 - Que nos devuelva la información detallada

#2. Client i Reserva:
   - Registrar un nou client i obtenir un identificador únic.
   - Permetre a un client fer una reserva per a una destinació específica.
   - Donar informació detallada d'una reserva.

   2.1 - Registramos un cliente
   2.2 - Añdadir un indetificador unico al cliente




3. Interfície d'Usuari:
   - Mostrar les opcions disponibles a l'usuari.
   - Executar l'acció associada a l'opció seleccionada per l'usuari.




lista_usuarios()
lista_viajes()



fun mostrarMenu() {

    println("--- Menu ---")
    println("1. Afegiu un viatge")
    println("2. Consultar viatges")
    println("3. Detallsviatge")
    println("4. Registrar client")
    println("5. Fer reserva")
    println("6 ")

}


fun leerOpcio(): Int {
    print("Selecciona una opcio: ")
    va opcio:Int = readLine()?.toInt()

   
}






 fun main() {
    mostrarMenu()
        val optio = leerOpcio()
        // Executar opcio
    }



    fun demanarDestinacio(): String {
        print("Introdueix el desti: ")
        val destinacio: string = readLine()!!

        return destinacio
    }

    fun detallsViatge(viatges: MutableList<Map<String, Double>>) {
        val destinacio: String = demanarDestinacio()
        viatges ---> es una lista
        viatge ---> es un diccionario de un solo elemento, donde la llave es el destinacio

    }

   fun registrarClient(Clients)




    fun executarOpcio(opcio: Int, viatges: MutableList<Map<String, Double>>) {
        when (opcio) {
          1->
          2->
          3->
          4->
          7-> println("Sortint de l'aplicacio")
          else -> println("Opcio no valida")            
  }

}