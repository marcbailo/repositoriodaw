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