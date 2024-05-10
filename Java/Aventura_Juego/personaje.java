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

    // Return
    public String getNom() {
        return nom;
    }

    public int getNivell() {
        return nivell;
    }

    public int getPuntsDeVida() {
        return puntsDeVida;
    }

    public int getPuntsDeMana() {
        return puntsDeMana;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
}

