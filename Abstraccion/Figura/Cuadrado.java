/**
 * Cuadrado is a Figura that has a lado and can calculate its area
 */
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double calcularArea(){
        return lado*lado;
    }
}
