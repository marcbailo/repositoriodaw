# Feu un programa anomenat GenerarHistograma que mostri l’histograma de totes les tirades possibles amb dos daus de sis cares. 

# Per fer això, l’estratègia que s’ha considerat és desar dins d’un  el nombre de repeticions de cada tirada possible (sempre entre 2 i 12)
#  i després treballar a partir d’aquests valors. 

# A continuació, ha de dir quin valor de tirada és el que té més repeticions. 

# A mode de guia, la sortida hauria de ser semblant a la que es mostra tot seguit:

# ''' 2: * 
#  3: ** 
#  4: *** 
#  5: **** 
#  6: ***** 
#  7: ****** 
#  8: ***** 
#  9: **** 
# 10: *** 
# 11: ** 
# 12: * 
# El màxim és 7.
# '''

# tiradas=[2,3,4,5,6,7,8,9,10,11,12]
# intervalor={}
# for tirada in tiradas:
#     if tirada in intervalor:
#         intervalor[tirada] +=1
#     else:
#         intervalor[tirada]=1
# for valor in sorted(intervalor):
#     print(f'{valor}:{intervalor[valor]}')

edades = [12, 15, 13, 12, 18, 20, 19, 20, 13, 12, 13, 17, 15, 16, 13, 14, 13, 17, 19]

intervalos = [(10, 13), (13, 16), (16, 19), (19, 22)]

mapa_edades = dict(zip(intervalos, [0] * len(intervalos)))

for edad in edades:
	for intervalo in mapa_edades:
		if intervalo[0] <= edad < intervalo[1]:
			mapa_edades[intervalo] += 1
			break

for valor in sorted(mapa_edades):
	print(f'{valor}: {"*" * mapa_edades[valor]}')