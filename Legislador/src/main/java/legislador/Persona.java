package legislador;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    
    
    public String toString() {
         String estadoCivil = " ";
        if (this.casado == false) {
            estadoCivil = " no ";
        }
        
        Integer datoEdad = edad;
        return getNombre() + " " + getApellido() + " tiene " + datoEdad.toString() + " años, y" + estadoCivil + "está casado";
    }
}
