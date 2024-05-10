public class Personaje {
    private String nom;
    private int nivell;
    private int puntsDeVida;
    private int puntsDeMana;
    private Arma arma;
    private Armadura armadura;

    // Constructor
    public Personaje(String nom, int nivell, int puntsDeVida, int puntsDeMana, Arma arma, Armadura armadura) {
        this.nom = nom;
        this.nivell = nivell;
        this.puntsDeVida = puntsDeVida;
        this.puntsDeMana = puntsDeMana;
        this.arma = arma;
        this.armadura = armadura;
    }

    

