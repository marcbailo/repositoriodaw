// Defineix una classe base anomenada Empleat  que representi un empleat genèric a l'empresa. Aquesta classe ha de tenir els atributs i mètodes següents:

    //Atributs: nom (String) i salari (double).
    //Constructor per inicialitzar els atributs.
    //Mètode imprimirDetalls() per imprimir els detalls de l'empleat, mostrant el nom i el salari.


    public class Empleat {
    private String nom;
    private double salari;

    public Empleat(String nom, double salari) {
        this.nom = nom;
        this.salari = salari;
    }