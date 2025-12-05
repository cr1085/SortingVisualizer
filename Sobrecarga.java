public class Sobrecarga {

    private int numeroA;
    private int numeroB;

    public Sobrecarga(int numeroA, int numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }

    public String comparar() {
        return ((this.numeroA + this.numeroB) > 10 ? "Si es mayor" : "No es mayor");
    }

    public void mostrarMensaje() {
        String msj;
        msj = "";
        
        int suma = this.numeroA + this.numeroB;
         
        msj="-----------------------------------\n";
        msj+="-"+suma+"                          \n";
        msj+="-"+this.comparar()+"               \n";
        msj+="-----------------------------------\n";
        
        
        System.out.println(msj);
    }

    public static void main(String[] args) {
     new Sobrecarga(3,5).mostrarMensaje();
    }

}
