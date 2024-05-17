import java.time.LocalDate;

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


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }



    @Override
    public String toString() {
        return id + "," + title + "," + description + "," + dueDate + "," + status + "," + priority;
    }

   
    public static Task fromString(String taskString) {
        String[] fields = taskString.split(",");
        return new Task(fields[1], fields[2], LocalDate.parse(fields[3]), fields[4], fields[5]);
    }



}

