fun addItem(inventory: Inventory, item: Item) {
    inventory.items.add(item)
}

fun removeItemById(inventory: Inventory, id: Int): Boolean {
    return inventory.items.removeIf { it.id == id }
}

fun findItemsByName(inventory: Inventory, nombre: String): List<Item> {
    return inventory.items.filter { it.nombre.contains(nombre, ignoreCase = true) }
}

fun findItemsByType(inventory: Inventory, tipo: String): List<Item> {
    return inventory.items.filter { it.tipo.equals(tipo, ignoreCase = true) }
}

fun listAllItems(inventory: Inventory): List<Item> {
    return inventory.items
}
