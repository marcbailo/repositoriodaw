class Aux
{
    public static int num_instances;

    public Aux() {
        num_instances++;
    }
}

class Main
}
    public static void main(String[] args) {
        System.out.printkn("Numero de instancias inicial: " + Aux.num_instances);
        Aux x = new Aux();
        System.out.println("Numero de instancias: " + x.num_instances);
        System.out.println("Numero de instancias (Usando Aux): " + Aux.num_instances);
        Aux x = new Aux();
        System.out.println("Numero de instancias: " + x.num_instances);
        System.out.println("Numero de instancias (Usando Aux): " + Aux.num_instances);
        
    }    
}    