import java.io.*;

public class AdministradorTasca {
    private Map<String, List<Task>> priorityLists; // Mapa per a llistes de tasques per prioritat.
    private Map<Integer, Task> taskMap; // Mapa per a tasques identificades pel seu ID.
    private String filename; // Nom del fitxer on es guarden les tasques.

   