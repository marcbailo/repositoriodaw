package Calculadora;
import java.util.Scanner;
class Teclado

{
	public static String leer(String texto){
        Pantalla.escribir(texto);
	Scanner lectorTeclado = new Scanner(System.in);
	String resultado = lectorTeclado.nextLine();

	return resultado;


	}

}

