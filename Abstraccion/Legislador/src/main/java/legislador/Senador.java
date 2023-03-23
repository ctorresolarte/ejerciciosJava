
package legislador;


public class Senador extends Legislador{
    private int asientoCamaraAlta;

    public Senador(int asientoCamaraAlta, String provinciaRepresenta, String partidoPolitico, int numeroDespacho, String nombre, String apellido, int edad, boolean casado) {
        super(provinciaRepresenta, partidoPolitico, numeroDespacho, nombre, apellido, edad, casado);
        this.asientoCamaraAlta = asientoCamaraAlta;
    }

    public int getAsientoCamaraAlta() {
        return asientoCamaraAlta;
    }

    public void setAsientoCamaraAlta(int asientoCamaraAlta) {
        this.asientoCamaraAlta = asientoCamaraAlta;
    }
    
    public String toString(){
        return super.toString()+"\nSu numero de asiento en la camara alta es "+
                getAsientoCamaraAlta();
    }

    @Override
    public void getCamaraEnQueTrabaja() {
        System.out.println("Senadores");
    }
    
}
