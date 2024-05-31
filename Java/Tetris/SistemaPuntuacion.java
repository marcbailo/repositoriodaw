public class SistemaPuntuacion {
    int puntuacionMin;
    int puntuacionMax;
    int score;

public SistemaPuntuacion(int puntuacionMin, int puntuacionMax) {
        this.puntuacionMin = puntuacionMin;
        this.puntuacionMax = puntuacionMax;
        this.score = 0;
    }

    public void reset() {
        score = 0;
    }
}