package legislador;

public abstract class Legislador extends Persona {

    String provinciaRepresenta;
    String partidoPolitico;
    int numeroDespacho;

    public Legislador() {
    }

    public Legislador(String provinciaRepresenta, String partidoPolitico, int numeroDespacho, String nombre, String apellido, int edad, boolean casado) {
        super(nombre, apellido, edad, casado);
        this.provinciaRepresenta = provinciaRepresenta;
        this.partidoPolitico = partidoPolitico;
        this.numeroDespacho = numeroDespacho;
    }

    public String getProvinciaRepresenta() {
        return provinciaRepresenta;
    }

    public void setProvinciaRepresenta(String provinciaRepresenta) {
        this.provinciaRepresenta = provinciaRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    public String toString() {
        return super.toString() +"\nRepresenta a la provincia de "+getProvinciaRepresenta()
                + " para el " + getPartidoPolitico()+ " y su numero de despacho es " + getNumeroDespacho();
    }
    
    abstract public void getCamaraEnQueTrabaja();
}
