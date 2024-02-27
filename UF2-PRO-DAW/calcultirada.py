#PRE: Hacer un programa que calcule la probabilidad en porcentaje de sacar por debajo de un valor en concreto usando 2 dados de 6 caras.


def calcular_tirada()
    llegir valor()
    generar_tirades()
    mostrar_probabilitat()

    
def generar_tirades() -> None:
    i:int = 1

    while i <= CARES_DAU:
        j:int = 1
        while j <= CARES_DAU:
            '''
            El nombre minim es 2, aixi que aquest sera el primer index que trobariem
            Com que les llistes comencen en el 0, aquesta diferencia sera la que
            ens marcara quin es el numero que busquem index 0 es el valor 2
            index 1 es el valor 3
            ...
            index 10 es el valor 12
            '''
            llista_tirades[i + j - 2] += 1
            j += 1
        i += 1    

def llegir_valor()
    valor : int = int(input("Escriu el valor a calcular [2 - 12].\n"))        
    while not valor es correcto(valor):
        valor = input()

    return valor

def mostrar_probabilidat(valor: int)
    acumulador        