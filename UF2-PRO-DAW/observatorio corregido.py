#Registro de temperatures

temperatures = []
mes = 1
dia = 1
fi = False


#Problema general

def inici():
#Primer nivell de descomposicio
def mostrar_menu():
    print("Benvingut al registre de temperatures")
    print("-------------------------------------")
    print("[RT] Registrar temperatures setmanas.")
    print("[MJ] Consultar temperatura mitjana.")
    print("[DF] Consultar diferencia maxima.")
    print("[FI] Sortir.")


def tractar_opcion():
    opcio = input("Opcio:  ")
    if opcio.casefold() == "RT".casefold():
        registre_temperatures_setmanals()
    elif opcio.casefold() == "MJ".casefold():
        mostrar_mitjana()
    elif opcio.casefold() == "DF".casefold():
        mostrar_diferencia()
    elif opcio.casefold() == "FI".casefold():
        finalitzar_execucio()                              


#Segon nivell de descomposicio
def registre_temperatures_setmanals():
    if (len(temperatures) + 7) > (52*7):
        print("Ja tenim totes les setmanes introudides no podem introduir mes.")

    else:
        llegir_temperatures_teclat()
        incrementar_data()        


def mostrar_mitjana():
    mitjana = calcular_mitjana()
    print("Fins avui", end=" ")
    
    mostrar_data()
    print("La mitjana ha estat de", mitjana, "graus.")

def mostrar_diferencia():
     diferencia = calcular_diferencia()
     print("Fins avui", end=" ")
     mostrar_data()
     print("la diferencia maxima ha estat de", diferencia, "graus.")
    
def mostrar_execucio():

def finalitzar_execucio():
    global fi
    fi = True

#Tercer nivell de descomposicio
def llegir_temperatures_teclat():
    lector=input("Escriu les temperatures d'aquesta setmana: ")
    for temperatura in lector.split():
        temperatures.append(float(temperatura.replace(',','.')))


def calcular_mitjana():
    suma = 0
    for temperatura in temperatures:
        suma += temperatura

    return suma/len(temperatures)        

def calcular_diferencia():
    minima = temperatures[0]
    maxima = temperatures[0]

    for temperatura in temperatures:
        if minima > temperatura:
            minima = temperatura

        if    

def mostrar_data():

def incrementar_data():



    