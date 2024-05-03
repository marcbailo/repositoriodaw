 
//A. Crear 2 Arbres d’enters de fondaria 5.
//B. Mostrar quantes instancies existeixen d‘arbres.
//C. Crear 2 Arbres de caràcters de fondaria 3.
//D. Mostrar quantes instancies existeixen d’arbres.
//E. Forçar al Garbage Collector.
//F. Recorrer el primer arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques dretes.
//G. Recorrer el segon arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques esquerres.
//H. Tornar a mostrar quantes instancies existeixen.
//I. Tornar a forçar al Garbage Collector.
//J. Tornar a mostrar quantes instancies existeixen.
//7. Opcional: Podries fer alguna forma de saber per pantalla que ha sigut eliminat per el Garbage Collector? Fes-ho.


 public class Principal {

public static void main(String[] args) {

 }

}

ArbreBinari ArbolEnt = new ArbreBinari(1,5);
ArbreBinari ArbolEnt = new ArbreBinari(3,2);

System.out.println("Instancias arbolesEnt: " + ArbreBinari.InstanciesArbre());


ArbreBinari ArbolCar = new ArbreBinari(1,3);
ArbreBinari ArbolCar = new ArbreBinari(2,1);

System.out.println("Instancias arbolesCar: " + ArbreBinari.InstanciesArbre());


System.gc();

ArbolEnt.recorrerderecha();

ArbolEnt.recorrerizquierda();


ArbolCar.recorrerderecha();

ArbolCar.recorrerderecha();

System.out.println("Instancias arboles después del garbage collector" + ArbreBinari.InstanciesArbre());