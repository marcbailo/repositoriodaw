package Calculadora;

class Principal

{
	public static void main (String[] args) {
	Menu.imprimir();
	String opcion = Teclado.leer("Introduce la opcion:");
	Menu.selecciona(opcion);

	}

}
