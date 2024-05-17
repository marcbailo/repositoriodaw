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

class Aux
{
    public static int num_instances;

    public Aux() {
        num_instances++;
    }
}

class Main
}
    public static void main(String[] args) {
        System.out.printkn("Numero de instancias inicial: " + Aux.num_instances);
        Aux x = new Aux();
        System.out.println("Numero de instancias: " + x.num_instances);
        System.out.println("Numero de instancias (Usando Aux): " + Aux.num_instances);
        Aux x = new Aux();
        System.out.println("Numero de instancias: " + x.num_instances);
        System.out.println("Numero de instancias (Usando Aux): " + Aux.num_instances);
        
    }    
}    




//CORRECCION


import java.util.HashMap;
import java.util.ArrayList;

class TaskManagement
{
	HashMap<String, ArrayList<Task>> lists;
	HashMap<Integer, Task> tasks;

	public TaskManagement() {
		lists = new HashMap<String, ArrayList<Task>>();
		lists.put("Baja", new ArrayList<Task>());
		lists.put("Media", new ArrayList<Task>());
		lists.put("Alta", new ArrayList<Task>());
		tasks = new HashMap<Integer, Task>();
	}

	public void addTask(String taskName, String priority) {
		Task task = new Task(taskName);
		lists.get(priority).add(task);
		tasks.put(task.getId(), task);
	}

	public void doneTask(int taskId) {
		tasks.get(taskId).done();
	}

	public void deleteTask(int taskId) {
		tasks.remove(taskId);
	}

	public void printAllTask() {
		tasks.forEach((key, task) -> {
			System.out.println(task);
		}
		);
	}

	public void printTaskByPriority(String priority) {
		System.out.println("Tareas de prioridad: " + priority);
		for (Task task: lists.get(priority)) {
			System.out.println(task);
		}
	}
}

class Task 
{
	private static int numInstances = 0;
	private int id;
	private String name;
	private boolean isDone;

	public Task(String name) {
		this.name = name;
		this.isDone = false;
		this.id = ++numInstances;
	}

	public void done() {
		this.isDone = true;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public boolean isDone() {
		return this.isDone;
	}

	public String toString() {
		return "Id:" + id.toString() + " Name: " + name + "Is done:" + isDone.toString();
	}
}

class Main
{
	public static void main(String[] args) {
		TaskManagement manager = new TaskManagement();
		System.out.println("Add task");
		manager.addTask("Aprobar Programacion", "Alta");
		System.out.println("Hacemos Print de todo");
		manager.printAllTask();
		System.out.println("Hacemos Print de prioridad");
		manager.printTaskByPriority("Alta");
		System.out.println("Hacemos que la tarea este done");
		manager.doneTask(1);
		System.out.println("Hacemos Print de todo");
		manager.printAllTask();
		System.out.println("Eliminamos la tarea");
		manager.deleteTask(1);
		System.out.println("Hacemos Print de todo");
		manager.printAllTask();
	}
}

