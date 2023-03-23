
package legislador;


public class Diputado extends Legislador{
    private int asientoCamaraBaja;


    public Diputado(int asientoCamaraBaja, String provinciaRepresenta, String partidoPolitico, int numeroDespacho, String nombre, String apellido, int edad, boolean casado) {
        super(provinciaRepresenta, partidoPolitico, numeroDespacho, nombre, apellido, edad, casado);
        this.asientoCamaraBaja = asientoCamaraBaja;
    }

    public int getAsientoCamaraBaja() {
        return asientoCamaraBaja;
    }

    public void setAsientoCamaraBaja(int asientoCamaraBaja) {
        this.asientoCamaraBaja = asientoCamaraBaja;
    }

    public String toString(){
        return super.toString()+"\nSu numero de asiento en la camara baja es "+getAsientoCamaraBaja();
    }
    
    @Override
    public void getCamaraEnQueTrabaja() {
        System.out.println("Diputados");
    }
    
    
}
