public class Gestor_Tasques {

int identificador;

String descripcio;

String prioritat;



public Gestor_Tasques(int identificador, String descripcio, String prioritat) {


this.Tasques = new ArrayList<>();

}

}



public Llista_Tasques {

List<String> lista = new ArrayList<>();

String [] Tasques = {"Baixa","Mitjana","Alta"};

List<String> Lista_Tasques = Arrays.asList(Tasques);

}

//CORRECCION


class TaskManagement
{
    public TaskManagement() {}
    lists = new HashMap<String, ArrayList<Task>>();
    lists.put("Baja", new ArrayList<Task>());
    lists.put("Media", new ArrayList<Task>());
    lists.put("Alta", new ArrayList<Task>());
    tasks = new HashMap<int, Task>();
}

    public void addTask(String taskName, String priority) {}

    public void doneTask(int taskId) {}

    public void deleteTask(int taskId) {}

    public void printAllTask() {}

    public void printTaskByPriority(String priority) {}

}

class Main 
{
    public void main(String[] args) {
    TaskManagement manager = new TaskManagement();
    manager.addTask("Aprobar Programación","Alta");
    manager.printAllTask();
    manager.printTaskByPriority("Alta");
    manager.doneTask(1);
    manager.printAllTask();

    }
}






}


