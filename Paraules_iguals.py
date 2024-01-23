#PRE: Mirar cuantas veces se repite una palabra en el texto y cuantas

texto= input('Pon el texto que tu quieras aquí:')
texto= texto.casefold()
paracontar= texto.split(" ")

#Es cojer el texto y una vez separado por los espacios, hacer que leamos todas las palabras introducidas.

for palabra in range(len(paracontar)):
    # si la palabra es igual a otra palabra, suma 1.
    for palabra2 in range (len(paracontar)):
        if paracontar[palabra] == paracontar[palabra2]:
        


            
