public class Triangulo extends Figura {
    private double base;
    private double altura;

    // * */ A constructor.
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

   /**
    ** Calculates the area of a triangle
    * 
    * @return The area of the triangle.
    */
    public double CalcularArea() {
        return (base * altura) / 2;
    }

}
