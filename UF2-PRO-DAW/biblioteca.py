biblioteca = []

#Como he explicado en mi primer commit, he vuelto a hacer lo mismo pero con las 2 últimas funciones, la de devolver y salir. Le he añadido 2 defs y abajo los he  
#añadido junto a los elif, esto hará que se repita función solo con el elif de abajo, el que corresponda a acada función.


    
def agregar_libro(biblioteca):
        titulo = input("Ingrese el título del libro: ")
        autor = input("Ingrese el autor del libro: ")
        genero = input("Ingrese el género del libro: ")
        disponibilidad = True
        libro = {"titulo": titulo, "autor": autor, "genero": genero, "disponibilidad": disponibilidad}
        biblioteca.append(libro)
        print(f'Libro "{titulo}" agregado a la biblioteca.')

def prestar_libro(biblioteca):
        titulo = input("Ingrese el título del libro a prestar: ")
        encontrado = False
        for libro in biblioteca:
            if libro["titulo"] == titulo and libro["disponibilidad"]:
                libro["disponibilidad"] = False
                print(f'Libro "{titulo}" prestado con éxito.')
                encontrado = True
                break
        if not encontrado:
            print(f'Libro "{titulo}" no disponible para préstamo.')

def devolver_libro(biblioteca):
        titulo = input("Ingrese el título del libro a devolver: ")
        encontrado = False
        for libro in biblioteca:
            if libro["titulo"] == titulo and not libro["disponibilidad"]:
                libro["disponibilidad"] = True
                print(f'Libro "{titulo}" devuelto con éxito.')
                encontrado = True
                break
        if not encontrado:
            print(f'No se puede devolver el libro "{titulo}".')

def salir_libro(biblioteca):
        print("Saliendo del programa.")
        

# He quitado este break ya que no está en ningún bucle.

while True:
    print("\n1. Agregar libro")
    print("2. Prestar libro")
    print("3. Devolver libro")
    print("4. Salir")

    opcion = input("Seleccione una opción: ")


    if opcion == "1":
        agregar_libro(biblioteca)
    
    elif opcion == "2":
        prestar_libro(biblioteca)
        

    elif opcion == "3":
        devolver_libro(biblioteca)


    elif opcion == "4":
        salir_libro(biblioteca)
    else:
        print("Opción no válida. Por favor, seleccione una opción correcta.")