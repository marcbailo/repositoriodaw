package com.example.database;


public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();


        // Crear un nou estudiant
        Student student = new Student(1, "Joan", "Garcia");
        dbManager.addStudent(student);


        // Recuperar estudiant
        Student retrievedStudent = dbManager.getStudent(1);
        System.out.println(retrievedStudent);


        // Actualitzar estudiant
        student.setLastName("Martínez");
        dbManager.updateStudent(student);


        // Eliminar estudiant
        dbManager.deleteStudent(1);


        dbManager.disconnect();
    }
}
