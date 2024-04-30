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
