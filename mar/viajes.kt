// # Imagina que treballes per a una agència de viatges i et demanen desenvolupar una aplicació senzilla en Kotlin per gestionar la informació dels viatges. La tasca consisteix a aplicar els principis de disseny top-down i parametrització de funcions per crear una solució modular i ben estructurada.

// # Requisits:

// # 1. Gestió de Viatges:
// #    - Poder afegir un nou viatge a la llista.
    fun main(arg:Array<String>){
    var listaViajes: List<String> = listOf("idk, idk, idk")
    println("Lista: $listaViajes")
    }
// #    - Poder obtenir informació resumida de tots els viatges.
// #    - Donar informació detallada d'un viatge específic.

// fun gestiondeViajes(arg:Array<String>){
//     var myEmptyList: List<Int> = listof()
//     prin
// }
fun gestiondeViajes(): String{
    println("Benvenido a la aerolinia Mimis")
    println("1.Gestion de Viajes")
    println("2.Clientes y reservas")
    println("3.a")
    var viajitos: String? = readLine()

	if (viajitos == null) {
		viajitos = ""
	}

	return viajitos
}


// # 2. Client i Reserva:
// #    - Registrar un nou client i obtenir un identificador únic.
// #    - Permetre a un client fer una reserva per a una destinació específica.
// #    - Donar informació detallada d'una reserva.
fun client():

// fun reserva():
// # 3. Interfície d'Usuari:
// #    - Mostrar les opcions disponibles a l'usuari.
// #    - Executar l'acció associada a l'opció seleccionada per l'usuari.
 fun usuari():
// # Nota:
// # Pots assumir que ja tens una llista de viatges, clients i reserves inicials per a les primeres proves de l'aplicació.


SELECT e.employee_name, d.department_name, p.project_name
    FROM employees e
    LEFT JOIN departments d ON e.department_id = d.department_id
    LEFT JOIN projects p ON e.project_id = p.project_id;
