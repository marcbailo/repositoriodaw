import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Cargar personajes, armas y armaduras desde XML
            ArrayList<Personaje> personajes = GestorJuego.cargarPersonajesDesdeXML("personatjes.xml");
            ArrayList<Arma> armas = GestorJuego.cargarArmasDesdeXML("arma.xml");
            ArrayList<Armadura> armaduras = GestorJuego.cargarArmadurasDesdeXML("armadura.xml");
            
            // Realizar otras operaciones con los personajes, armas y armaduras cargados
        } catch (Exception e) {
            // Manejo de excepciones (p.ej., archivo no encontrado)
            System.out.println("Error: " + e.getMessage());
        }
    }
}


