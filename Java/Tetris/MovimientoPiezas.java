public class MovimientoPiezas {
    public void moverIzquierda(Piezas pieza) {
        pieza.position.x -= 1;
    }

    public void moverDerecha(Piezas pieza) {
        pieza.position.x += 1;
    }

    public void moverAbajo(Piezas pieza) {
        pieza.position.y += 1;
    }

    public void rotar(Piezas pieza) {
        
    }
}