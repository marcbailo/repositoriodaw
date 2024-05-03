 interface FiguraGeometrica {

public abstract calcularArea();
public abstract calcularPerimetre();


}

public interface FiguraGeometrica {


public void calcularArea();
public void calcularPerimetre();

}


 abstract class Figura2D implements FiguraGeometrica {

 public Figura2D(String nom)  {
 this.nom = nom; 

 } 
}


class Cercle extends Figura2D {
    double radi;

public Figura2D(String nom) {
        this.nom = nom;
    }

}

class Rectangle extends Figura2D {
     double base;
    double altura;
}



//CORRECCIÓN

1.
Interface FiguraGeometrica

double calcularArea();
 double calcularPerimetre();

2.
String nom;
Figura2D(String nom) {
this.nom = nom;

}

3.
class Cercle extends Figura2d {
    double radi;

    Circle(String nom, double radi) {
        super(nom);
        this.radi = radi;

    }

    @Override
    public double calcularArea() {
        return radi * radi Math.PI;
1. Crea una nova classe en Java per a la implementació de l'arbre binari.
2. Implementa constructors per a la creació de l'arbre binari.
3. Volem que les instancies d’arbre sapiguen quantes instancies coexisteixen a la vegada.
4. Volem poder fer servir dos tipus d’arbres, un d’enters i un altre de caracters.
5. No volem que hi hagi cap tipus d’ordenació, simplement volem que estigui balancejat, aixó vol dir que cada branca tingui la mateixa profunditat.
6. Crear una classe Principal que s’encarregui de fer les següents tasques:
A. Crear 2 Arbres d’enters de fondaria 5.
B. Mostrar quantes instancies existeixen d‘arbres.
C. Crear 2 Arbres de caràcters de fondaria 3.
D. Mostrar quantes instancies existeixen d’arbres.
E. Forçar al Garbage Collector.
F. Recorrer el primer arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques dretes.
G. Recorrer el segon arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques esquerres.
H. Tornar a mostrar quantes instancies existeixen.
I. Tornar a forçar al Garbage Collector.
J. Tornar a mostrar quantes instancies existeixen.
7. Opcional: Podries fer alguna forma de saber per pantalla que ha sigut eliminat per el Garbage Collector? Fes-ho.


    }

    @Override
    public double calcularPerimetre() {
        return 2* radi* Math.PI;

    }
}

4.
class Rectangle extends Figura2D {
    double base;
    double altura;

    Rectangle(String nom, double base, double altura) {
        super(nom);
        this.base = base;
        this.altura = altura;
    }

@Override
public double calcularArea() {
    return base * altura;
}

@Override
public double calcularPerimetre() {
    return 2 * (base + altura);

}

class Main {
    public static void main(String[] args) {
        //Crear Cercle i crear Recangle
        Cercle cercle = new Cercle(nom:"Cercle", radi:5);
        Rectangle rectangle = new Rectangle(nom:"Rectangle", base:4, altura:3);

        //Mostrar area i perimetre de cada figura
        imprimirDatos(cercle);
        imprimirDatos(rectangle);

    }

private static void imprimirDatos(Figura2d figura) {
    System.out.println("El area del:" + figura.nom +": " + figura.calcularArea)    
    System.out.println("El perimetro del :" + figura.nom + ": " + figura.calcularPerimetre)
}

}





}
