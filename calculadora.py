#PRE: Recibiremos 2 numeros enteros y un numero que indique la operacion
def calculadora():
    # Const
    TXT_INTRODUCIR_NUMEROS = "Introduce un numero entero:"
    TXT_INTRODUCE_OPERACION = "Introduce que operacion hacer 1 para suma, 2 para resta, 3 para multiplicar y 4 para division:"
    SUMA = 1
    RESTA = 2
    MULTIPLICACION = 3
    DIVISION = 4
    # EndConst

    # Var
    a = None
    b = None
    operando = None

    # EndVar

    a = int(input(TXT_INTRODUCIR_NUMEROS))
    operando = int(input(TXT_INTRODUCE_OPERACION))
    b = int(input(TXT_INTRODUCIR_NUMEROS))

    if a == SUMA:
        result = a + b
    elif operando == RESTA:
        result = a - b
    elif operando == MULTIPLICACION:
        result = a * b
    elif operando == DIVISION and b != 0:
        result = a / b
    elif operando == DIVISION and b == 0: 
        result = "No se puede hacer cuando de 0"    
    else:
        result = "Operando no soportado por la aplicacion"

    print(result)
#POST: Devolveremos el resultado de la operacion seleccionada si esta existe

calculadora() #Esto es importante, si no invocamos no se ejecuta 