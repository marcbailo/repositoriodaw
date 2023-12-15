#PRE El prgrama lea al usuario una lista de tuplas dónde cada tupla representa una información

estudiants= ("nom", "cognom", "edat", "Nota1", "Nota2","Nota3")
<<<<<<< HEAD


nom = str(input("Cuál es tu nombre?"))
apeliido = str(input("Cuál es tu apellido?"))
edat = int(input("Cuál es tu edad?"))
=======
input(estudiants) # Aqui estas pidiendo algo por pantalla al usuario, pero no lo guardas en nungun sitio.

nom = str(input("Cuál es tu nombre?") # input ya es un string, no hace falta hacer el cast a str
apeliido = str(input("Cuál es tu apellido?")
edat = int(input("Cuál es tu edad?")
>>>>>>> 2520b0064eed817dd006212ec72615a8cb1875ee
Nota1 = int(input("Cuál es tu Nota1?"))
Nota2 = int(input("Cuál es tu Nota2?"))
Nota3 = int(input("Cuál es tu Nota3?"))

#nota1 * 0.3 
#nota2 * 0.3
#nota3 * 0.4
nota_final = (Nota1 * 0.3) + (Nota2 * 0.4) + (Nota3 * 0.3)
print(nota_final)


