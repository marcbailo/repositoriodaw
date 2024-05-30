public class Book {
    private String title;
    private String author;
    private int availableCopies;

public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

public void returnBook() {
        availableCopies++;
        System.out.println("Libro devuelto: " + title + ", Author: " + author);
    }

public void info() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available Copies: " + availableCopies);
    }


public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getAvailableCopies() { return availableCopies; }
    public void setAvailableCopies(int availableCopies) { this.availableCopies = availableCopies; }
}






