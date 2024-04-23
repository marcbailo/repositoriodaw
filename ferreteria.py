# Ferreteria Online

# Tenim un programa per gestionar una ferreteria online. Volem poder fer la compra de productes de ferreteria, afegint al carrito els productes de la compra.
# Volem poder veure que hi ha dins del carrito, i quina es la quantitat a pagar.
# Volem poder treure productes parcials (passar de 2 claus a 1 clau) o tota una linea de compra. Poder finalitzar la compra fent el pagament.

# Hem de poder crear les classes necessaries per fer aquest exercici.

# Ferreteria online
# 1.Compra productes
# 2.Afegir al carrito
# 3.Veure productes dins
# 4.Pagar 
# 5.finalitzar la compra


# 1.Gestionar compras en una ferreteria
# 2.1 Gestionar carrito de compra
# 2.2 Pagar compra 
# 3.1.1 Añadir productos al carrito
# 3.1.2 Eliminar productos del carrito
# 3.2.1.Calcular imorte
# 3.2.2Finalizar compra

# 1.Gestionar carrito de compra
# 2.1 Añadir productos al carrito
# 2.2 Eliminar productos del carrito
# 2.3 Eliminar linea de compra 
# 2.4 Calcular importe

class carrito:
    def add_product(self, product:str, qty: int ) -> None:
        ...
    def decrement_product(self, product:str ) -> None:
        ...   
    def delete_line(self, product:str) ->None:
        ...
    def calculate_total(self) -> int:
        ...