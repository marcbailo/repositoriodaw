import os
import shutil

def esborrar_contingut_carpeta(carpeta):
    """
    Esborra tot el contingut d'una carpeta, incloent fitxers i subcarpetes.
    
    :param carpeta: Ruta a la carpeta a buidar.
    """
    # Verifiquem que la ruta és una carpeta
    if not os.path.isdir(carpeta):
        print(f"La ruta {carpeta} no és una carpeta vàlida.")
        return

  # Recorrem tots els elements dins de la carpeta
    for element in os.listdir(carpeta):
        # Obtenim la ruta completa de l'element
        ruta_element = os.path.join(carpeta, element)
        
        # Si l'element és un fitxer o un enllaç simbòlic, l'esborrem
        if os.path.isfile(ruta_element) or os.path.islink(ruta_element):
            os.unlink(ruta_element)  # Elimina el fitxer o enllaç simbòlic
        # Si l'element és una carpeta, la buidem i després l'esborrem
        elif os.path.isdir(ruta_element):
            shutil.rmtree(ruta_element)  # Elimina la carpeta i tot el seu contingut
    
    print(f"Tot el contingut de la carpeta {carpeta} ha estat esborrat.")  # Confirmació de l'eliminació


def main():
    # Llegim la ruta de la carpeta des del teclat
    carpeta = input("Introdueix la ruta de la carpeta a buidar: ")
    
    # Esborrem tot el contingut de la carpeta
    esborrar_contingut_carpeta(carpeta)

if __name__ == "__main__":
    main()