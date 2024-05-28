import java.io.File

fun loadMenu(filename: String): List<String> {
    return File(filename).readLines()
}

fun showMenu(options: List<String>) {
    options.forEach { println(it) }
}

fun main() {
    val inventory = loadInventoryFromFile("inventory.json")
    val menuOptions = loadMenu("menu.txt")
    
    while (true) {
        showMenu(menuOptions)
        when (readLine()!!.toInt()) {
            1 -> {
                println("Introducir datos del ítem (id, nombre, tipo, valor, peso):")
                val (id, nombre, tipo, valor, peso) = readLine()!!.split(",").map { it.trim() }
                addItem(inventory, Item(id.toInt(), nombre, tipo, valor.toInt(), peso.toDouble()))
            }
            2 -> {
                println("Introducir ID del ítem a eliminar:")
                val id = readLine()!!.toInt()
                if (removeItemById(inventory, id)) println("Ítem eliminado.") else println("Ítem no encontrado.")
            }
            3 -> {
                println("Introducir nombre para buscar:")
                val nombre = readLine()!!
                val items = findItemsByName(inventory, nombre)
                items.forEach { println(it) }
            }
            4 -> {
                println("Introducir tipo para buscar:")
                val tipo = readLine()!!
                val items = findItemsByType(inventory, tipo)
                items.forEach { println(it) }
            }
            5 -> {
                val items = listAllItems(inventory)
                items.forEach { println(it) }
            }
            6 -> println("Valor total: ${totalValue(inventory)} oro")
            7 -> println("Peso total: ${totalWeight(inventory)} kg")
            8 -> println("Ítem más valioso: ${mostValuableItem(inventory)}")
            9 -> println("Ítem más pesado: ${heaviestItem(inventory)}")
            0 -> {
                saveInventoryToFile(inventory, "inventory.json")
                println("Inventario guardado. Saliendo...")
                return
            }
            else -> println("Opción no válida.")
        }
    }
}
