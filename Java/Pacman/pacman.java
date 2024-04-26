
//Clase Pacman
public class pacman {

private int  newPosX;
private int  newPosY;
private int  speed;
private int  vidas;
private int puntuación;
private int Poder;


}

// Valores añadidos a Pacman que devuelven como la posición, vidas...

public Pacman(int initialnewPosX, int initialnewPosY) {

this.PosX = initialnewPosX;
this.PosY = initialnewPosY;
this.vidas = 3;
this.puntuación = 0;
this.poder = false;


}

 // La estructura del movimiento de Pacman, cómo se mueve hacia arriba, abajo, derecha e izquierda

public void move(int newPosX, int newPosY) {

public moveup(int moveY) {

this.moveY += 1;

}

public movedown(int moveY) {

this.moveY -=1;

}

public moveleft(int moveX) {

this.moveX += 1;   

} 

public moveright(intmoveX) {

this.moveX -=1;

}











