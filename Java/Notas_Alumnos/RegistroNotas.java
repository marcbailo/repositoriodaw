public class GestorNotes {



}

class registrarNotes {

public GestorNotes(String numAlumne, double[] notes) {
    this.numAlumne = numAlumne;
    this.notes = notes;
   
    }
}




//CORRECCION


public class GestorNotes
{
    public void registrarNotes(String nomAlumne, double[] notes) {

    }

    public double[] obtenirNotes(String nomAlumne) {
        return new double[]{0,0};
    }
}



import java.util.Hastable;

public class GestorNotes
{

    private Hashtable<String, double[]> alumnes = new Hashtable<String, double[]>();

    public void registrarNotes(String nomAlumne, double[] notes) {
        alumnes.put(nomAlumne, notes);

        public double[] obtenirNotes(String nomAlumne) {
            return alumnes.get(nomAlumne);
        }
    }




public class CalculadoraEstadisitques
{

public double calcularMitjana(double[] notes) {
    double suma = 0.0;
}

}