#PRE// Solicitar al usuario que ingrese un número entero positivo
N = 0
while N <= 0:
    N = int(input(" Ingresa un número entero positivo: "))
    if N <= 0:
        print(" Ingresa un número entero positivo mayor que 0.")

a, b = 0, 1
count = 0

print("La serie de Fibonacci es:")
while count < N:
    print(a, end=" ")
    a, b = b, a + b
    count += 1

    #POST// Generar y mostrar los primeros N números de la serie de Fibonacci

