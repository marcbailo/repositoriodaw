# Primera tarea, LEER el enunciado
# Si no entiendo las reglas, busco en Google!


cartas = ['As', '2s' , '3s' , '4s' , '5s' , '6s' , '7s' , '8s' , '9s',
          '10s' ,'Js ', 'Qs ', 'Ks ', 'Ah ', '2h ', '3h ', '4h ', '5h ', '6h ',
          '7h ', '8h ', '9h ', '10h ', 'Jh ', 'Qh ', 'Kh ', 'Ac ', '2c', '3c ',
          '4c ', '5c ', '6c ', '7c ', '8c ', '9c ', '10c ', 'Jc ', 'Qc ', 'Kc ',
          'Ad ', '2d ', '3d ', '4d ', '5d ', '6d ', '7d ', '8d ', '9d ', '10d ',
          'Jd ', 'Qd ', 'Kd ']
   
          
# Ya tenemos las cartas, tenemos que repartr las manos, 13 cartas a cada jugador
jugadores = [[], [], [], []]
for i in range(0, 13):
    for j in range(0, 4):
        jugadores[j].append(cartas.pop())


# Vamos a crear un pequeño test para saber si el codigo funciona hasta aqui 
index = 1
for jugador in jugadores:
    print(f"Jugador {index}:", ", ".join(jugador))
    print("Cartas repartidas al jugador:", len(jugador))
    print()
    index = index + 1      

# Hasta aqui nuestro codigo funciona, que toca hacer ahora?       

mesa = []
for jugador in jugadores:

    mesa.append(jugador.pop(0))

# hasta aqui jugamos la primera mano
# Quien gana la mano? La carta mas alta, que mantenga el mismo palo que la primera carta de la mesa   

carta = mesa.pop(0)

carta_mas_alta = {"numero": carta[:-1], "palo": carta[-1]}
for carta in mesa:
    carta_a_comparar = {"numero": carta[:-1], "palo": carta [-1]}
    if carta_mas_alta["numero"] < carta_a_comparar["numero"]:
        carta_mas_alta = carta_a_comparar
                        
                  