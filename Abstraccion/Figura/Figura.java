public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    /**
     * CalcularArea() is a function that returns a double and takes no parameters.
     * 
     * @return The area of the shape.
     */
    public abstract double calcularArea();

    public String getColor() {
        return color;
    }

}
