public class Tasca {
    private String title; 
    private String description; 
    private LocalDate dueDate; 
    private String status; 
    private String priority; 

    private static int counter = 0; 
    private int id; 

    public Task(String title, String description, LocalDate dueDate, String status, String priority) {
        this.id = ++counter; 
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
    }

















}

